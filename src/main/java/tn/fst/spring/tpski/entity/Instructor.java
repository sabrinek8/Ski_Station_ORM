package tn.fst.spring.tpski.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numInstructor;
    private String firstName;
    private String lastName;
    private Date dateOfHire;
    @OneToMany
    private Set<Course> courses;
}
