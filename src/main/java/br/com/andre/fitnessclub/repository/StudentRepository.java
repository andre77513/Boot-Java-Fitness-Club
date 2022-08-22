package br.com.andre.fitnessclub.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.andre.fitnessclub.core.crud.CrudRepository;
import br.com.andre.fitnessclub.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

    @Query(value = "select s from Student s where s.name = :name")
    Student consultByName(@Param("name") String name);

    @Query(value = "select * from student s where s.name like '%Cardoso' ", nativeQuery = true)
    Student findByNameNative();

    Student findByName(String name);
}
