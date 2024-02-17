package com.example.exericejmapper.mapper;

import com.example.exericejmapper.StructureComptable;
import com.example.exericejmapper.StructureComptableComplexeDto;
import com.example.exericejmapper.StructureComptableDto;
import org.mapstruct.BeanMapping;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface StructureComptableMapper {
    StructureComptable toEntity(StructureComptableDto structureComptableDto);
    StructureComptableDto toDto(StructureComptable structureComptable);
    @Mapping(source = "rattachementLibelleLong", target = "structureComptableRattachement.libelleLong")
    @Mapping(source = "rattachementLibelleCourt", target = "structureComptableRattachement.libelleCourt")
    @Mapping(source = "structureComptableRattachement", target = "structureComptableRattachement.id")
    StructureComptable toEntityComplexe(StructureComptableComplexeDto structureComptableComplexeDto);
    @InheritInverseConfiguration(name = "toEntityComplexe")
    StructureComptableComplexeDto toDtoComplexe(StructureComptable structureComptable);
//    @InheritConfiguration(name = "toEntityComplexe")
//    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
//    StructureComptable partialUpdateComplexe(StructureComptableComplexeDto structureComptableComplexeDto,
//                                             @MappingTarget StructureComptable structureComptable);
//    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
//    StructureComptable partialUpdate(StructureComptableDto structureComptableDto,
//                                     @MappingTarget StructureComptable structureComptable);
}