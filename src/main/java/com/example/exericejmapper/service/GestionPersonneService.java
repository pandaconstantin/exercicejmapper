package com.example.exericejmapper.service;

import com.example.exericejmapper.*;
import com.example.exericejmapper.api.GestionPersonneAPIClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class GestionPersonneService {
    private final GestionPersonneAPIClient gestionPersonneAPIClient;

    public AdresseDto createAdressePersonne(final AdresseDto payload) {
        return gestionPersonneAPIClient.createAdresse(payload);
    }

    public List<AdresseDto> getListeAdressePersonne() {
        return gestionPersonneAPIClient.getListeAdresse();
    }
    public PersonneDto createPersonne(final PersonneDto personneDto) {
        return gestionPersonneAPIClient.createPersonne(personneDto);
    }

    public List<PersonneDto> getListePersonnes() {
        return gestionPersonneAPIClient.getListePersonnes();
    }

    public PersonneSplitAdresseDto createPersonne(final PersonneSplitAdresseDto personneSplitAdresseDto) {
        return gestionPersonneAPIClient.createPersonne(personneSplitAdresseDto);
    }

    public List<PersonneSplitAdresseDto> getListePersonneSplits() {
        return gestionPersonneAPIClient.getListePersonneSplits();
    }

    public PersonneComplexeDto createPersonneComplexe(final PersonneComplexeDto payload) {
        return gestionPersonneAPIClient.createPersonneComplexe(payload);
    }

    public List<PersonneComplexeDto> getListePersonneComplexes() {
        return gestionPersonneAPIClient.getListePersonneComplexes();
    }

    public StructureComptableComplexeDto createStructureComplexe(final StructureComptableComplexeDto payload) {
        return gestionPersonneAPIClient.createStructureComplexe(payload);
    }

    public List<StructureComptableComplexeDto> getListeStructureComplexes() {
        return gestionPersonneAPIClient.getStructureComptableComplexes();
    }

    public StructureComptableDto createStructure(final StructureComptableDto payload) {
        return gestionPersonneAPIClient.createStructureComptable(payload);
    }

    public List<StructureComptableDto> getListeStructures() {
        return gestionPersonneAPIClient.getStructureComptables();
    }

}
