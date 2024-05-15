package com.elitech.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Rectangle extends Polygone {
private int hauteur;
private int largeur;

}
