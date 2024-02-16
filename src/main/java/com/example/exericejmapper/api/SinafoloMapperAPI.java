package com.example.exericejmapper.api;

import com.example.exericejmapper.*;
import com.googlecode.jmapper.api.JMapperAPI;
import org.springframework.stereotype.Component;
import static com.googlecode.jmapper.api.JMapperAPI.*;

@Component
public class SinafoloMapperAPI {
    public JMapperAPI jMapperAPI() {

        JMapperAPI jmapperAPI = new JMapperAPI()
                .add(mappedClass(AdresseDto.class).add(global())
                )
                .add(mappedClass(PersonneDto.class)
                        .add(global().excludedAttributes("adresse"))
                        .add(attribute("adresse").value("${adresse}"))
                )
                .add(mappedClass(PersonneSplitAdresseDto.class)
                        .add(global().excludedAttributes("adresseId", "numeroRue"))
                        .add(attribute("adresseId").value("${adresse.id}"))
                        .add(attribute("numeroRue").value("${adresse.numeroRue}"))
                        //TODO Appliquer le converter
                        .add(attribute("adresse").value("${adresse}").customGet("getAdresseForMapper"))
                )
                .add(mappedClass(Personne.class)
                        .add(global().excludedAttributes("adresse", "adresse.id"))
                        //TODO Appliquer le converter
                        .add(attribute("adresse").customGet("getAdresseForMapper"))
                );

        return jmapperAPI;
    }
}
