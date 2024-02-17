package com.example.exericejmapper;


import lombok.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StructureComptableDto implements Serializable {
    private Long id;
    private String libelleCourt;
    private String libelleLong;
    private StructureComptableDto structureComptableRattachement;
}