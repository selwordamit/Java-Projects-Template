package com.example.project.mappers;

import com.example.project.domain.dtos.*;
import com.example.project.domain.entities.*;
import org.mapstruct.*;

import java.util.List;

/**
 * Mapper for converting between [EntityName] and its DTOs.
 */
@Mapper(componentModel = "spring")
public interface [EntityName]Mapper {

    [EntityName] toEntity([EntityName]Request request);

    [EntityName]Response toResponse([EntityName] entity);

    List<[EntityName]Response> toResponseList(List<[EntityName]> entities);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateFromDto(Update[EntityName]Request dto, @MappingTarget [EntityName] entity);
}
