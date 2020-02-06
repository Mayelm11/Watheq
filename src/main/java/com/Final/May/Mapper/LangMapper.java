package com.Final.May.Mapper;

import com.Final.May.model.Language;
import com.Final.MayDTO.LangDTO;

public interface LangMapper {

	Language dtoToDomain(final LangDTO Language );

	LangDTO domainToDto(final Language Language );
}
