package ru.ionin.mongodemo.model;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Electrician extends Employee {

    private int voltageLevel;

    public Electrician(String name, int age, int voltageLevel) {
        super(null, name, age, "electrician");
        this.voltageLevel = voltageLevel;
    }
}
