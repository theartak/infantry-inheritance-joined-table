package com.jambit.artinheritancejoinedtable.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "KNIGHT")
public class Knight extends Infantry {
    private Boolean shield;

    public Knight() {
    }

    public Knight(InfantryType infantryType, Integer movementSpeed, Integer durability, Integer attack, Boolean shield) {
        super(infantryType, movementSpeed, durability, attack);
        this.shield = shield;
    }
}
