package com.example.exericejmapper.api;

import com.example.exericejmapper.*;
import com.example.exericejmapper.repository.AdresseRepository;
import com.example.exericejmapper.repository.PersonneRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
@Slf4j
public class GestionPersonneAPIImpl implements GestionPersonneAPIClient {
    private final PersonneRepository personneRepository;
    private final AdresseRepository adresseRepository;
    private final SinafoloMapper sinafoloMapper;
    @Override
    public AdresseDto createAdresse(final AdresseDto payload) {
        Adresse adresseEntity = sinafoloMapper.map(payload, Adresse.class);
        adresseEntity = adresseRepository.save(adresseEntity);
        return sinafoloMapper.map(adresseEntity, AdresseDto.class);
    }

    @Override
    public PersonneDto createPersonne(final PersonneDto payload) {
        log.info("{{{-}}} " + payload);
        Personne personneEntite = sinafoloMapper.map(payload, Personne.class);
        personneEntite = personneRepository.save(personneEntite);
        log.info("\u001B[32m" + personneEntite + "\u001B[0m");
        return sinafoloMapper.map(personneEntite, PersonneDto.class);
    }

    @Override
    public List<PersonneDto> getListePersonnes() {
        List<Personne> listePersonnes = personneRepository.findAll();
        return listePersonnes.stream().map(p -> sinafoloMapper.map(p, PersonneDto.class)).collect(Collectors.toList());
    }

    @Override
    public List<AdresseDto> getListeAdresse() {
        List<Adresse> listeAdresses = adresseRepository.findAll();
        return listeAdresses.stream().map(a -> sinafoloMapper.map(a, AdresseDto.class)).collect(Collectors.toList());
    }

    @Override
    public PersonneSplitAdresseDto createPersonne(PersonneSplitAdresseDto payload) {
        log.info("{{{}}} " + payload);
        Personne personneEntite = sinafoloMapper.map(payload, Personne.class);
        personneEntite = personneRepository.save(personneEntite);
        return sinafoloMapper.map(personneEntite, PersonneSplitAdresseDto.class);
    }

    @Override
    public List<PersonneSplitAdresseDto> getListePersonneSplits() {
        List<Personne> listePersonnes = personneRepository.findAll();
        return listePersonnes.stream().map(p -> sinafoloMapper.map(p, PersonneSplitAdresseDto.class))
               .collect(Collectors.toList());
    }
}
