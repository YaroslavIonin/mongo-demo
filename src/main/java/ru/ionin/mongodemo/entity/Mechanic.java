package ru.ionin.mongodemo.entity;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mechanic extends Employee {

    private String specialization;

    public Mechanic(String name, int age, String specialization) {
        super(null, name, age, "mechanic");
        this.specialization = specialization;
    }
}
