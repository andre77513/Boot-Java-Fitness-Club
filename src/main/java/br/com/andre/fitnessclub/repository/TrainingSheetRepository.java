package br.com.andre.fitnessclub.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.andre.fitnessclub.core.crud.CrudRepository;
import br.com.andre.fitnessclub.entity.TrainingSheet;

@Repository
public interface TrainingSheetRepository extends CrudRepository<TrainingSheet, Long> {

    @Query(value = "select * from training_sheet ts where ts.personal_id = 2 and ts.id = 2", nativeQuery = true)
    TrainingSheet findByNameNative();

}
