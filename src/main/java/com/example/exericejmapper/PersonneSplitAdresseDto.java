package com.example.exericejmapper;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PersonneSplitAdresseDto implements Serializable {

    private Long id;
    private String nom;
    private String prenom;
    private Long adresseId;
    private String numeroRue;


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
