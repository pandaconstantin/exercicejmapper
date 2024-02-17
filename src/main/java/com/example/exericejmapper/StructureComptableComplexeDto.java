package com.example.exericejmapper;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.io.Serializable;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StructureComptableComplexeDto implements Serializable {
    private Long id;
    private String libelleCourt;
    private String libelleLong;
    private Long structureComptableRattachement;
    private String rattachementLibelleCourt;
    private String rattachementLibelleLong;
}