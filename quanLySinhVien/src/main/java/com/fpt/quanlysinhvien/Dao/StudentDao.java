package com.fpt.quanlysinhvien.Dao;

import com.fpt.quanlysinhvien.model.Student;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    private List<Student> list;
    public StudentDao() throws ParseException {
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        list = new ArrayList<>();
        list.add(new Student(1, "Thuc", df.parse("12/12/2000"), "nam", "TPHCM"));
        list.add(new Student(2, "Thuc", df.parse("12/12/2000"), "nam", "TPHCM"));
        list.add(new Student(3, "Thuc", df.parse("12/12/2000"), "nam", "TPHCM"));
        list.add(new Student(4, "Thuc", df.parse("12/12/2000"), "nam", "TPHCM"));
    }
    public  List<Student> findAll() {
        return list;
    }
    public void addStudent(Student student) {
        list.add(student);
    }
}
