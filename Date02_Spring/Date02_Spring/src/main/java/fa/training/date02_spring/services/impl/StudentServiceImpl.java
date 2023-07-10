package fa.training.date02_spring.services.impl;

import fa.training.date02_spring.model.Student;
import fa.training.date02_spring.repository.StudentRepository;
import fa.training.date02_spring.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student getOne(int id) {
        return studentRepository.getById(id);
    }

    @Override
    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public boolean deleteStudentById(int id) {
        if (studentRepository.getById(id) == null) {
            return false;
        }
        studentRepository.deleteById(id);
        return true;
    }

    @Override
    public void updateStudent(Student student) {
        studentRepository.save(student);
    }

}
