package br.com.andre.fitnessclub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.andre.fitnessclub.core.crud.CrudController;
import br.com.andre.fitnessclub.dto.StudentDTO;
import br.com.andre.fitnessclub.entity.Student;
import br.com.andre.fitnessclub.repository.StudentRepository;

@RestController
@RequestMapping("/student")
public class StudentController extends CrudController<Student, StudentDTO, Long> {

    @Autowired
    public StudentRepository studentRepository;

    @GetMapping("/n/{name}")
    public Student studentNameHql(@PathVariable("name") String name) {
        return studentRepository.consultByName(name);
    }

    @GetMapping("/student")
    public Student findByNameNative() {

        return studentRepository.findByNameNative();
    }

    @GetMapping("/name/{name}")
    public Student studentName(@PathVariable("name") String name) {

        return studentRepository.findByName(name);
    }
}
