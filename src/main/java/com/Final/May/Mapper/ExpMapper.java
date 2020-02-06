package com.Final.May.Mapper;

import com.Final.May.model.Experience;
import com.Final.MayDTO.ExpeDTO;

public interface ExpMapper {

	Experience dtoToDomain(final ExpeDTO Experience );

	ExpeDTO domainToDto(final Experience Experience );
}
