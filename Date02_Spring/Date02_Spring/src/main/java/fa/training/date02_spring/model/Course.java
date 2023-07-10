package fa.training.date02_spring.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "course")
    private List<Student> studentList;
}
