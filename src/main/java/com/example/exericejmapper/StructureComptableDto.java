package com.example.exericejmapper;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import java.io.Serializable;
import java.util.Objects;


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