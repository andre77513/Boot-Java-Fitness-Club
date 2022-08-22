package br.com.andre.fitnessclub.service;

import org.springframework.stereotype.Service;

import br.com.andre.fitnessclub.core.crud.CrudService;
import br.com.andre.fitnessclub.entity.Personal;

@Service
public class PersonalService extends CrudService<Personal, Long>{

    @Override
    protected Personal entityUpdate(Personal recovered, Personal entity) {
        recovered.setName(entity.getName());
        recovered.setCpf(entity.getCpf());
        recovered.setTelephone(entity.getTelephone());
        return recovered;
    }
    
}
