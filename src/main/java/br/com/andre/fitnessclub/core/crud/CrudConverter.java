package br.com.andre.fitnessclub.core.crud;

public interface CrudConverter<T, D> {

    D entityForDTO(T entity);

    T dtoForEntity(D dto);

}
