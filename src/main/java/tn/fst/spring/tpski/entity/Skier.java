package tn.fst.spring.tpski.entity;
import jakarta.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Skier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSkier;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String city;

    @ManyToMany(mappedBy = "skiers")
    private Set<Piste> pistes;

    @OneToOne()
    private Subscription subscription;

    @OneToMany(mappedBy = "skier")
    private Set<Registration> registrations;

}
