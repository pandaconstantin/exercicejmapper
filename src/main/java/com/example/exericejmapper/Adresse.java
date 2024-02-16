package com.example.exericejmapper;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "adresse")
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "numeroRue")
    private String numeroRue;
    @Column(name = "ville")
    private String ville;
    @Column(name = "pays")
    private String pays;
}