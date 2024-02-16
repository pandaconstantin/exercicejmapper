package com.example.exericejmapper.api;

import com.example.exericejmapper.AdresseDto;
import com.example.exericejmapper.Personne;
import com.example.exericejmapper.PersonneDto;
import com.example.exericejmapper.PersonneSplitAdresseDto;

import java.util.List;

public interface GestionPersonneAPIClient {
    AdresseDto createAdresse(AdresseDto payload);
    PersonneDto createPersonne(PersonneDto payload);
    List<PersonneDto> getListePersonnes();
    List<AdresseDto> getListeAdresse();
    PersonneSplitAdresseDto createPersonne(PersonneSplitAdresseDto payload);
    List<PersonneSplitAdresseDto> getListePersonneSplits();
}
