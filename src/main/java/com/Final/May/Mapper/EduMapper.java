package com.Final.May.Mapper;

import com.Final.May.model.Education;
import com.Final.MayDTO.EduDTO;

public interface EduMapper {

	Education dtoToDomain(final EduDTO Education);

	EduDTO domainToDto(final Education Education );
}
