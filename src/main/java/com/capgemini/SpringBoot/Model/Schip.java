package com.capgemini.SpringBoot.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Schip {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    String type;
    int lengte;
    int aantalPassagiers;
    LocalDateTime bouwdatum;
    public String naam;
    int topSnelheid;

}
