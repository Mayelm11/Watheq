package com.Final.May.Mapper;

import com.Final.May.model.Course;
import com.Final.MayDTO.CouDTO;

public interface CouMapper {

	Course dtoToDomain(final CouDTO Course );

	CouDTO domainToDto(final Course Course );

}
