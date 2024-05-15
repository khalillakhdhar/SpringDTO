package com.elitech.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Triangle extends Polygone {
private int base;
}
