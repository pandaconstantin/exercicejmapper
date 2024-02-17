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
    @SequenceGenerator(name = "id_adresse_sequence", sequenceName = "id_adresse_sequence", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "id_adresse_sequence")
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "numeroRue")
    private String numeroRue;
    @Column(name = "ville")
    private String ville;
    @Column(name = "pays")
    private String pays;
}