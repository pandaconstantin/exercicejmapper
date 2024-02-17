package com.example.exericejmapper.api;

import com.example.exericejmapper.*;

import java.util.List;

public interface GestionPersonneAPIClient {
    AdresseDto createAdresse(AdresseDto payload);
    PersonneDto createPersonne(PersonneDto payload);
    List<PersonneDto> getListePersonnes();
    List<AdresseDto> getListeAdresse();
    PersonneSplitAdresseDto createPersonne(PersonneSplitAdresseDto payload);
    List<PersonneSplitAdresseDto> getListePersonneSplits();
    PersonneComplexeDto createPersonneComplexe(PersonneComplexeDto payload);
    List<PersonneComplexeDto> getListePersonneComplexes();
    StructureComptableDto createStructureComptable(StructureComptableDto payload);
    StructureComptableComplexeDto createStructureComplexe(StructureComptableComplexeDto payload);
    List<StructureComptableDto> getStructureComptables();
    List<StructureComptableComplexeDto> getStructureComptableComplexes();
}
