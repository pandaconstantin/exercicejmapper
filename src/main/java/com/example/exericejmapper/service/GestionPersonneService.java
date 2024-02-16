package com.example.exericejmapper.service;

import com.example.exericejmapper.AdresseDto;
import com.example.exericejmapper.Personne;
import com.example.exericejmapper.PersonneDto;
import com.example.exericejmapper.PersonneSplitAdresseDto;
import com.example.exericejmapper.api.GestionPersonneAPIClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

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
}
