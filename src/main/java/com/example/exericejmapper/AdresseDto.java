package com.example.exericejmapper;

import lombok.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AdresseDto implements Serializable {
    private Long id;
    private String numeroRue;
    private String ville;
    private String pays;
}