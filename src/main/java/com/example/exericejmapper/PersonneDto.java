package com.example.exericejmapper;


import lombok.*;
import java.io.Serializable;


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