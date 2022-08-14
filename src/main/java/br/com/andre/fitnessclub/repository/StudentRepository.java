package br.com.andre.fitnessclub.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.andre.fitnessclub.core.crud.CrudRepository;
import br.com.andre.fitnessclub.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

    Object findByName = null;

    @Query(value = "select s from Student s where s.name = :name")
    Student consultByName(@Param("name") String name);

    Student findByName(String name);

}
