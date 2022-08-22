package br.com.andre.fitnessclub.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.andre.fitnessclub.core.crud.CrudController;
import br.com.andre.fitnessclub.dto.PersonalDTO;
import br.com.andre.fitnessclub.entity.Personal;

@RestController
@RequestMapping("/personal")
public class PersonalController extends CrudController<Personal, PersonalDTO, Long>{
    
}
