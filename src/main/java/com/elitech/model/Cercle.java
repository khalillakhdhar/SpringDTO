package com.elitech.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Cercle extends Forme {
private int centreX;
private int centreY;
}
