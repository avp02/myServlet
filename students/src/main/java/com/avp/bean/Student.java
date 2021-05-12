package com.avp.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    public static List<Student> total = new ArrayList<>();

    private Integer id;
    private String name;
    private String lastName;
//    private String email;
    private int age;
}
