package tn.fst.spring.tpski.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class Piste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numPiste;
    String namePiste;
    @Enumerated(EnumType.STRING)
    Color color;
    int length;
    int slope;
    @ManyToMany()
    private Set<Skier> skiers;
}
