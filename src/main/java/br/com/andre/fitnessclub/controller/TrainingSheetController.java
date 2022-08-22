package br.com.andre.fitnessclub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.andre.fitnessclub.core.crud.CrudController;
import br.com.andre.fitnessclub.dto.TrainingSheetDTO;
import br.com.andre.fitnessclub.entity.TrainingSheet;
import br.com.andre.fitnessclub.repository.TrainingSheetRepository;

@RestController
@RequestMapping("/tsheet")
public class TrainingSheetController<ID> extends CrudController<TrainingSheet, TrainingSheetDTO, Long> {

    @Autowired
    private TrainingSheetRepository trainingSheetRepository;

    @GetMapping("/personal-id")
    public TrainingSheet findByNameNative() {

        return trainingSheetRepository.findByNameNative();
    }

}
