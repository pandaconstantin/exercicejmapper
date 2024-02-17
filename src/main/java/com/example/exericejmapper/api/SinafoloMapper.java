package com.example.exericejmapper.api;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.api.enums.MappingType;
import com.googlecode.jmapper.api.enums.NullPointerControl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * Classe pour la gestion des mapping.
 *
 * @author Constantin Drabo <panda.constantin  at gmail.org>
 * @version 1.O
 * @since 17-04-2023
 */
@Component
@RequiredArgsConstructor
public class SinafoloMapper {
    private final SinafoloMapperAPI sinafoloMapperAPI;
    /**
     * Méthode pour le mappage des beans et des entités.
     *
     * @param <T> Classe de l'objet de destination
     * @param <U> Classe de l'object source
     * @param source Instance du type de classe source.
     * @param destination Type de classe de destination
     * @return T
     */
    public <T, U> T map(final U source, final Class<T> destination) {
        JMapper<T, U> jMapper = new JMapper<>(destination, (Class<U>) source.getClass(), sinafoloMapperAPI.jMapperAPI());
        return jMapper.getDestination(source, NullPointerControl.SOURCE, MappingType.ONLY_VALUED_FIELDS);
    }
}
