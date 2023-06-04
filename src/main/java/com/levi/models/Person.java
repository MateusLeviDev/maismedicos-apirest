package com.levi.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "TB_PERSON")
@NoArgsConstructor
@Getter
@Setter
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    @Setter(AccessLevel.NONE) //we cant change "id", just DB
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "cpf", nullable = false, unique = true)
    private String cpf;

    @Column(name = "age", nullable = false)
    private Integer age;

    @Builder //to organize when instantiate
    public Person(String name, String cpf, Integer age) {
        this.name = name;
        this.cpf = cpf;
        this.age = age;
    }
}
