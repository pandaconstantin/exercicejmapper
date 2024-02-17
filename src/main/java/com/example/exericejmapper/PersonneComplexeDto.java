package com.example.exericejmapper;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class PersonneComplexeDto implements Serializable {
    private Long id;
    private String nom;
    private String prenom;
    private Long adresseId;
    private String numeroRue;
    private String ville;
    private String pays;
    @JsonIgnore
    private AdresseDto adresse;
    @JsonIgnore
    public AdresseDto getAdresseForMapper() {
        if (adresse != null) {
            return adresse;
        } else {
            adresse = new AdresseDto();
            adresse.setId(adresseId);
            return adresse;
        }
    }
}