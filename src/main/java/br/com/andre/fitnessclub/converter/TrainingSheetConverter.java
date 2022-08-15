package br.com.andre.fitnessclub.converter;

import org.springframework.stereotype.Component;

import br.com.andre.fitnessclub.core.crud.CrudConverter;
import br.com.andre.fitnessclub.dto.TrainingSheetDTO;
import br.com.andre.fitnessclub.entity.TrainingSheet;

@Component
public class TrainingSheetConverter implements CrudConverter<TrainingSheet, TrainingSheetDTO> {

    @Override
    public TrainingSheetDTO entityForDTO(TrainingSheet entity) {
      
        return new TrainingSheetDTO(entity.getId(), entity.getType(), entity.getComments(), null);
    }

    @Override
    public TrainingSheet dtoForEntity(TrainingSheetDTO dto) {

        return new TrainingSheet(dto.getId(), dto.getType(), dto.getComments(), null);
    }

}
