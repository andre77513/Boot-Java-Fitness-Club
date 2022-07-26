package br.com.andre.fitnessclub.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.andre.fitnessclub.core.crud.CrudController;
import br.com.andre.fitnessclub.dto.StudentDTO;
import br.com.andre.fitnessclub.entity.Student;

@RestController
@RequestMapping("/aluno")
public class StudentController extends CrudController<Student, StudentDTO, Long>{
    
}
