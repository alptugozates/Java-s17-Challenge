package com.workintech.S17Challenge.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class Course {
    private String name;
    private int credit;
    private Grade grade;
    private int id;
}
