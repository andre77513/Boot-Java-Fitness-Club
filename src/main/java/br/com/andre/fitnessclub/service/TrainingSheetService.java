package br.com.andre.fitnessclub.service;

import org.springframework.stereotype.Service;

import br.com.andre.fitnessclub.core.crud.CrudService;
import br.com.andre.fitnessclub.entity.TrainingSheet;

@Service
public class TrainingSheetService extends CrudService<TrainingSheet, Long> {

    @Override
    protected TrainingSheet entityUpdate(TrainingSheet recovered, TrainingSheet entity) {
        recovered.setType(entity.getType());
        recovered.setType(entity.getType());
        recovered.setComments(entity.getComments());
        return recovered;
    }

}
