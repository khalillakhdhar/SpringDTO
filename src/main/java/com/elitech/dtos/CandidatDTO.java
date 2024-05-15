package com.elitech.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
@Data
public class CandidatDTO {
private long id;
@Min(value = 18,message = "l'age doit être >18")
private int age;
@NotBlank(message = "veuillez verifier vos champs")
private String adresse,nom,prenom,tel;
@JsonIgnoreProperties("candidats")
private List<FormationDTO> formations;
}
