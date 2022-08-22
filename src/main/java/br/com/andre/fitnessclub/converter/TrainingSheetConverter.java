package br.com.andre.fitnessclub.converter;

import org.springframework.stereotype.Component;

import br.com.andre.fitnessclub.core.crud.CrudConverter;
import br.com.andre.fitnessclub.dto.TrainingSheetDTO;
import br.com.andre.fitnessclub.entity.TrainingSheet;
import br.com.andre.fitnessclub.repository.PersonalRepository;
import br.com.andre.fitnessclub.repository.StudentRepository;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class TrainingSheetConverter implements CrudConverter<TrainingSheet, TrainingSheetDTO> {

    private final StudentConverter studentConverter;
    private final PersonalConverter personalConverter;
    private final StudentRepository studentRepository;
    private final PersonalRepository personalRepository;

    @Override
    public TrainingSheet dtoForEntity(TrainingSheetDTO dto) {

        var tsheet = new TrainingSheet();
        tsheet.setId(dto.getId());
        tsheet.setType(dto.getType());
        tsheet.setComments(dto.getComments());

        tsheet.setStudent(studentRepository.findById(dto.getStudentId()).orElse(null));
        tsheet.setPersonal(personalRepository.findById(dto.getPersonalId()).orElse(null));

        return tsheet;
    }

    @Override
    public TrainingSheetDTO entityForDTO(TrainingSheet entity) {

        var dto = new TrainingSheetDTO();
        dto.setId(entity.getId());
        dto.setType(entity.getType());
        dto.setComments(dto.getComments());

        dto.setStudent(studentConverter.entityForDTO(entity.getStudent()));
        dto.setPersonal(personalConverter.entityForDTO(entity.getPersonal()));

        return dto;
    }

}
