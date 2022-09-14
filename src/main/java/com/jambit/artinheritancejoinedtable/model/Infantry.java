package com.jambit.artinheritancejoinedtable.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Infantry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Enumerated(value = EnumType.STRING)
    private InfantryType infantryType;
    private Integer movementSpeed;
    private Integer durability;
    private Integer attack;

    protected Infantry() {

    }

    protected Infantry(InfantryType infantryType, Integer movementSpeed, Integer durability, Integer attack) {
        this.infantryType = infantryType;
        this.movementSpeed = movementSpeed;
        this.durability = durability;
        this.attack = attack;
    }
}
