package com.example.studentapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_Id")
    private Long studentId;
    @Column(name = "student_Name")
    private String studentName;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
}
