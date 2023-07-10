package fa.training.date02_spring.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "firstname",nullable = false, length = 200)
    private String firstName;
    @Column(name = "lastname",nullable = false, length = 200)
    private String lastName;
    @Column(name = "email",nullable = false, length = 200)
    private String email;
    @Column(name = "phone",nullable = false, length = 200)
    private String phone;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
}
