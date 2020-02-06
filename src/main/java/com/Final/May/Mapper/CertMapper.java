package com.Final.May.Mapper;

import com.Final.May.model.Certification;
import com.Final.MayDTO.CertDTO;

public interface CertMapper {
	Certification dtoToDomain(final CertDTO Certification );

	CertDTO domainToDto(final Certification Certification );
}
