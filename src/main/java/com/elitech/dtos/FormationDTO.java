package com.elitech.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Null;
import lombok.Data;

@Data
public class FormationDTO {
	private long id;
	@NotBlank
	private String titre;
	@Null
	private String description;
	@NotBlank
	private String formateur;
	@JsonIgnoreProperties("formations")
	private List<CandidatDTO> candidats;

}
