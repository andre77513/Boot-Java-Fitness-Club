package br.com.andre.fitnessclub.service;

import org.springframework.stereotype.Service;

import br.com.andre.fitnessclub.core.crud.CrudService;
import br.com.andre.fitnessclub.entity.Student;

@Service
public class StudentService extends CrudService<Student, Long> {

    @Override
    protected Student entityUpdate(Student recovered, Student entity) {
        recovered.setName(entity.getName());
        return recovered;
    }

}
