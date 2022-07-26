package br.com.andre.fitnessclub.core.crud;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public abstract class CrudService<T, ID> {

    @Autowired
    protected CrudRepository<T, ID> repository;

    public Page<T> pagination(Pageable pageable) {

        return repository.findAll(pageable);
    }

    public List<T> readAll() {
        return repository.findAll();
    }

    public T readById(ID id) {
        return repository.findById(id).orElse(null);
    }

    public T create(T entity) {
        return repository.save(entity);
    }

    public void delete(ID id) {
        repository.deleteById(id);
    }

    public T update(ID id, T entity) {
        var recovered = readById(id);

        if (Objects.isNull(recovered)) {
            throw new RuntimeException("Não foi encontrado!");
        }
        var saveEntity = entityUpdate(recovered, entity);

        return repository.save(saveEntity);
    }

    protected abstract T entityUpdate(T recovered, T entity);

}