package com.fpt.quanlysinhvien.model;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    private  int id;
    private  String name;
    private Date birthDate;
    private String sex;
    private  String address;
}
