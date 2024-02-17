package com.example.exericejmapper.controller;

import com.example.exericejmapper.*;
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

    @PostMapping(path = "/personnecomplexe")
    public ResponseEntity<PersonneComplexeDto> createPersonneComplexe(@RequestBody final PersonneComplexeDto payload) {
        return new ResponseEntity<>(gestionPersonneService.createPersonneComplexe(payload), HttpStatus.CREATED);
    }

    @GetMapping(path = "/personnecomplexe")
    public ResponseEntity<List<PersonneComplexeDto>> getListePersonneComplexes() {
        return new ResponseEntity<>(gestionPersonneService.getListePersonneComplexes(), HttpStatus.OK);
    }

    @PostMapping(path = "/structurecomplexe")
    public ResponseEntity<StructureComptableComplexeDto> createStructureComplexe(@RequestBody final StructureComptableComplexeDto payload) {
        return new ResponseEntity<>(gestionPersonneService.createStructureComplexe(payload), HttpStatus.CREATED);
    }

    @GetMapping(path = "/structurecomplexe")
    public ResponseEntity<List<StructureComptableComplexeDto>> getListeStructureComplexes() {
        return new ResponseEntity<>(gestionPersonneService.getListeStructureComplexes(), HttpStatus.OK);
    }

    @PostMapping(path = "/structure")
    public ResponseEntity<StructureComptableDto> createStructureComptable(@RequestBody final StructureComptableDto payload) {
        return new ResponseEntity<>(gestionPersonneService.createStructure(payload), HttpStatus.CREATED);
    }

    @GetMapping(path = "/structure")
    public ResponseEntity<List<StructureComptableDto>> getListeStructureComptable() {
        return new ResponseEntity<>(gestionPersonneService.getListeStructures(), HttpStatus.OK);
    }
}
