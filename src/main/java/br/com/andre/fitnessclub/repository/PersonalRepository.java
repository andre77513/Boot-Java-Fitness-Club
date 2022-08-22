package br.com.andre.fitnessclub.repository;

import org.springframework.stereotype.Repository;

import br.com.andre.fitnessclub.core.crud.CrudRepository;
import br.com.andre.fitnessclub.entity.Personal;

@Repository
public interface PersonalRepository extends CrudRepository<Personal, Long>{
    
}
