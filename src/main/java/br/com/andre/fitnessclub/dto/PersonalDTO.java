package br.com.andre.fitnessclub.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonalDTO implements Serializable{
    
    private Long id;
    private String name;
    private String cpf;
    private String telephone;
}
