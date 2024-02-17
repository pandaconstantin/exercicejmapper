package com.example.exericejmapper;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@Table(name = "personne")
public class Personne {
    @Id
    @SequenceGenerator(name = "id_personne_sequence", sequenceName = "id_personne_sequence", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "id_personne_sequence")
    @Column(name = "id", nullable = false)
    private Long id;
    private String nom;
    private String prenom;
    @ManyToOne(fetch = FetchType.LAZY)
    private Adresse adresse;


    public Adresse getAdresseForMapper() {
        if (adresse != null) {
            return adresse;
        } else {
            return new Adresse();
        }
    }
}