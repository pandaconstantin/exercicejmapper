package com.example.exericejmapper.mapper;

import com.example.exericejmapper.*;
import com.googlecode.jmapper.api.Conversion;
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
                        .add(attribute("adresse").value("${adresse}").customGet("getAdresseForMapper"))
                )
                .add(mappedClass(Personne.class)
                        .add(global())
                        .add(attribute("adresse").customGet("getAdresseForMapper"))
                )
                .add(mappedClass(PersonneComplexeDto.class)
                        .add(global().excludedAttributes("adresseId", "numeroRue" , "ville" , "pays"))
                        .add(attribute("adresse").value("${adresse}").customGet("getAdresseForMapper"))
                        .add(attribute("adresseId").value("${adresse.id}"))
                        .add(attribute("numeroRue").value("${adresse.numeroRue}"))
                        .add(attribute("ville").value("${adresse.ville}"))
                        .add(attribute("pays").value("${adresse.pays}"))
                );

        return jmapperAPI;
    }
}
