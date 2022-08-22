package br.com.andre.fitnessclub.converter;

import org.springframework.stereotype.Component;

import br.com.andre.fitnessclub.core.crud.CrudConverter;
import br.com.andre.fitnessclub.dto.PersonalDTO;
import br.com.andre.fitnessclub.entity.Personal;

@Component
public class PersonalConverter implements CrudConverter<Personal, PersonalDTO>{

    @Override
    public PersonalDTO entityForDTO(Personal entity) {
      
        return new PersonalDTO(entity.getId(), entity.getName(), entity.getCpf(), entity.getTelephone());
    }

    @Override
    public Personal dtoForEntity(PersonalDTO dto) {
      
        return new Personal(dto.getId(), dto.getName(), dto.getCpf(), dto.getTelephone());
    }
    
}
