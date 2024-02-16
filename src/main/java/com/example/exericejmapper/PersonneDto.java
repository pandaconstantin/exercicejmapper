package com.example.exericejmapper;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.googlecode.jmapper.annotations.JMap;
import lombok.*;

import java.io.Serializable;

/**
 * DTO for {@link Personne}
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PersonneDto implements Serializable {
    private Long id;
    private String nom;
    private String prenom;
    private AdresseDto adresse;
}