package br.com.andre.fitnessclub.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.andre.fitnessclub.core.crud.CrudController;
import br.com.andre.fitnessclub.dto.TrainingSheetDTO;
import br.com.andre.fitnessclub.entity.TrainingSheet;

@RestController
@RequestMapping("/ficha-treino")
public class TrainingSheetController extends CrudController<TrainingSheet, TrainingSheetDTO, Long>{
    
}
