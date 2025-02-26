package tn.fst.spring.tpski.entity;
import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Subscription{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSub;
    private Date startDate;
    private Date endDate;
    private Float price;

    @Enumerated(EnumType.STRING)
    private TypeSubscription typeSub;

}
