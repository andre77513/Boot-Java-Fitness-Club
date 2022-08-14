package br.com.andre.fitnessclub.repository;

import org.springframework.stereotype.Repository;

import br.com.andre.fitnessclub.core.crud.CrudRepository;
import br.com.andre.fitnessclub.entity.TrainingSheet;

@Repository
public interface TrainingSheetRepository extends CrudRepository<TrainingSheet, Long>{
    
}
