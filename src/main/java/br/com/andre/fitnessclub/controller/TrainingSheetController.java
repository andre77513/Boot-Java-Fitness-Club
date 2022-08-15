package br.com.andre.fitnessclub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.andre.fitnessclub.core.crud.CrudController;
import br.com.andre.fitnessclub.dto.TrainingSheetDTO;
import br.com.andre.fitnessclub.entity.TrainingSheet;
import br.com.andre.fitnessclub.repository.TrainingSheetRepository;

@RestController
@RequestMapping("/training-sheet")
public class TrainingSheetController extends CrudController<TrainingSheet, TrainingSheetDTO, Long> {

    @Autowired
    public TrainingSheetRepository trainingSheetRepository;

}
