package com.northwind.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NotEmpty
public class Student {
    private long id;
    private String name;
    private int age;
}
