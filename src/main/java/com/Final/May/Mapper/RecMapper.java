package com.Final.May.Mapper;

import com.Final.May.model.Recommendation;
import com.Final.MayDTO.RecDTO;

public interface RecMapper {
	Recommendation dtoToDomain(final RecDTO Recommendation );

	RecDTO domainToDto(final Recommendation Recommendation );
}
