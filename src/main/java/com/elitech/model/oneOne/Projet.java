package com.elitech.model.oneOne;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Projet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(nullable = false)
private String titre;
@Column(nullable = false)
private String description;
@Column(nullable = true)
private String url;
@OneToOne(cascade = CascadeType.ALL)
private Chef chef;
}
