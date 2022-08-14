package br.com.andre.fitnessclub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.andre.fitnessclub.core.crud.CrudController;
import br.com.andre.fitnessclub.dto.StudentDTO;
import br.com.andre.fitnessclub.entity.Student;
import br.com.andre.fitnessclub.repository.StudentRepository;

@RestController
@RequestMapping("/aluno")
public class StudentController extends CrudController<Student, StudentDTO, Long> {

    @Autowired
    public StudentRepository studentRepository;

    @GetMapping("nome")
    public Student studentName() {

        return studentRepository.findByName("André");
    }
}
