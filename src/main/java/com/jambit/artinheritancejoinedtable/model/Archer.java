package com.jambit.artinheritancejoinedtable.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ARCHER")
public class Archer extends Infantry {
    private Integer range;

    public Archer() {
    }

    public Archer(InfantryType infantryType, Integer movementSpeed, Integer durability, Integer attack, Integer range) {
        super(infantryType, movementSpeed, durability, attack);
        this.range = range;
    }
}
