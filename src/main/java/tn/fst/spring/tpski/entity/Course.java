package tn.fst.spring.tpski.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numCourse;
    private int level;
    @Enumerated(EnumType.STRING)
    private TypeCourse typeCourse;
    @Enumerated(EnumType.STRING)
    private Support support;
    private Float price;
    private int timeSlot;

    @OneToMany(mappedBy = "course")
    private Set<Registration> registrations;


}
