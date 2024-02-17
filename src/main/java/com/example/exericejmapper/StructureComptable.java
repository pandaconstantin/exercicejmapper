package com.example.exericejmapper;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "structure_comptable")
@NoArgsConstructor
@AllArgsConstructor
public class StructureComptable {
    @Id
    @Column(name = "id", nullable = false)
    @SequenceGenerator(name = "id_structure_sequence", sequenceName = "id_structure_sequence", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "id_structure_sequence")
    private Long id;
    private String libelleCourt;
    private String libelleLong;
    private Long structureComptableRattachement;
}