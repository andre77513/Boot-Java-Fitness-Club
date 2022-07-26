package br.com.andre.fitnessclub.core.crud;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

public abstract class CrudController<T extends CrudEntity<ID>, D, ID> {

    @Autowired
    protected CrudService<T, ID> service;

    @Autowired
    protected CrudConverter<T, D> converter;

    @GetMapping
    public ResponseEntity<Page<D>> pagination(Pageable pageable) {

        var paginatedList = service.pagination(pageable).map(converter::entityForDTO);

        return ResponseEntity.ok(paginatedList);
    }

    @GetMapping("/lista")
    public ResponseEntity<List<D>> readAll() {

        var dtoList = service.readAll().stream().map(converter::entityForDTO).collect(Collectors.toList());

        return ResponseEntity.ok(dtoList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<D> readById(@PathVariable("id") ID id) {
        var entity = service.readById(id);

        if (Objects.isNull(entity)) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(converter.entityForDTO(entity));
    }

    @PostMapping
    public ResponseEntity<D> create(@RequestBody D dto) {

        var entity = converter.dtoForEntity(dto);

        var saved = service.create(entity);

        ServletUriComponentsBuilder buider = ServletUriComponentsBuilder.fromCurrentRequest();

        var uri = buider.path("/{id}").buildAndExpand(saved.getId()).toUri();

        return ResponseEntity.created(uri).body(converter.entityForDTO(saved));
    }

    @PutMapping("/{id}")
    public ResponseEntity<D> update(@PathVariable("id") ID id, @RequestBody D dto) {

        var newEntity = converter.dtoForEntity(dto);
        var saved = service.update(id, newEntity);

        return ResponseEntity.ok(converter.entityForDTO(saved));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") ID id) {
        service.delete(id);

        return ResponseEntity.noContent().build();
    }

}
