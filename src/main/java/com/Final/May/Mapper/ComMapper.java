package com.Final.May.Mapper;

import com.Final.May.model.Company;
import com.Final.MayDTO.CompDTO;

public interface ComMapper {

	Company dtoToDomain(final CompDTO Company );

	CompDTO domainToDto(final Company Company );


}
