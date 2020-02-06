package com.Final.May.Mapper;

import com.Final.May.model.Individual;
import com.Final.MayDTO.IndivDTO;


public interface IndividualMapper {


	Individual dtoToDomain(final IndivDTO individual );

	IndivDTO domainToDto(final Individual individual );





}

