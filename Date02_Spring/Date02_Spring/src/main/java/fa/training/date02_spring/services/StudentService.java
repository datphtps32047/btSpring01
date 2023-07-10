package fa.training.date02_spring.services;

import fa.training.date02_spring.model.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAll();

    public Student getOne(int id);

    public void addStudent(Student student);

    public boolean deleteStudentById(int id);
    public void updateStudent(Student student);


}
