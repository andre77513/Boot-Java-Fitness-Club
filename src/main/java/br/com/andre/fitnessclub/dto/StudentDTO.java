package br.com.andre.fitnessclub.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentDTO implements Serializable {

    private Long id;
    private String name;
    private String cpf;
    private String telephone;

}
