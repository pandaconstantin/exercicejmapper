package com.example.exericejmapper.controller;

import com.example.exericejmapper.AdresseDto;
import com.example.exericejmapper.PersonneDto;
import com.example.exericejmapper.PersonneSplitAdresseDto;
import com.example.exericejmapper.service.GestionPersonneService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/gestionpersonne")
public class GestionPersonneController {
    private final GestionPersonneService gestionPersonneService;

    @PostMapping(path = "/adresse")
    public ResponseEntity<AdresseDto> createAdressePersonne(@RequestBody final AdresseDto payload) {
        return new ResponseEntity<>(gestionPersonneService.createAdressePersonne(payload), HttpStatus.CREATED);
    }

    @GetMapping(path = "/adresse")
    public ResponseEntity<List<AdresseDto>> getListeAdressePersonne() {
        return new ResponseEntity<>(gestionPersonneService.getListeAdressePersonne(), HttpStatus.OK);
    }

    @PostMapping(path = "/personne")
    public ResponseEntity<PersonneDto> createPersonne(@RequestBody final PersonneDto payload) {
        return new ResponseEntity<>(gestionPersonneService.createPersonne(payload), HttpStatus.CREATED);
    }

    @GetMapping(path = "/personne")
    public ResponseEntity<List<PersonneDto>> getListePersonnes() {
        return new ResponseEntity<>(gestionPersonneService.getListePersonnes(), HttpStatus.OK);
    }

    @PostMapping(path = "/personnesplit")
    public ResponseEntity<PersonneSplitAdresseDto> createPersonneSplit(@RequestBody final PersonneSplitAdresseDto payload) {
        return new ResponseEntity<>(gestionPersonneService.createPersonne(payload), HttpStatus.CREATED);
    }
    @GetMapping(path = "/personnesplit")
    public ResponseEntity<List<PersonneSplitAdresseDto>> getListePersonneSplits() {
        return new ResponseEntity<>(gestionPersonneService.getListePersonneSplits(), HttpStatus.OK);
    }
}
