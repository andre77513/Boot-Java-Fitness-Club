package br.com.andre.fitnessclub.converter;

import org.springframework.stereotype.Component;

import br.com.andre.fitnessclub.core.crud.CrudConverter;
import br.com.andre.fitnessclub.dto.StudentDTO;
import br.com.andre.fitnessclub.entity.Student;

@Component
public class StudentConverter implements CrudConverter<Student, StudentDTO> {

    @Override
    public StudentDTO entityForDTO(Student entity) {

        return new StudentDTO(entity.getId(), entity.getName(), entity.getCpf(), entity.getTelephone(), null);
    }

    @Override
    public Student dtoForEntity(StudentDTO dto) {

        return new Student(dto.getId(), dto.getName(), dto.getCpf(), dto.getTelephone(), null);
    }
}
