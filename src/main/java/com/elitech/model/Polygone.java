package com.elitech.model;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Polygone extends Forme {
private int angles;
}
