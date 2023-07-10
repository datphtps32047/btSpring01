package com.fpt.btspring01.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", unique = true, length = 10, nullable = false)
    private Long userId;
    @Column(name = "login_name", unique = true, nullable = false, length = 50)
    private String loginName;
    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;
    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;
    @Column(name = "email", unique = true , nullable = false, length = 50)
    private String email;
    @Column(name = "modified")
    private Date modifiedDate;
    @Column(name = "created")
    private Date createdDate;
    @Column(name = "last_login")
    private Date lastLogin;
    @Column(name = "disabled")
    private Boolean disabledStatus;
    @Column(name = "first_name_kana", nullable = false, length = 50)
    private String firstNameKana;
    @Column(name = "last_name_kana", nullable = false, length = 50)
    private String lastNameKana;
    @OneToOne
    @JoinColumn (name = "created_user_id", referencedColumnName = "user_id")
    @JoinColumn (name = "updated_user_id", referencedColumnName = "user_id")
    private user user;
    @ManyToOne
    @JoinColumn(name = "company_id", nullable = false)
    private company company;
    @ManyToOne
    @JoinColumn(name = "position_id", nullable = false)
    private position position;
}
