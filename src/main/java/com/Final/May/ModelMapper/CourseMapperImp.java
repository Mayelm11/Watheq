package com.Final.May.ModelMapper;



import com.Final.MayDTO.CouDTO;
import org.modelmapper.ModelMapper;
import com.Final.May.Mapper.CouMapper;
import com.Final.May.model.Course;



public class CourseMapperImp implements CouMapper{



	ModelMapper modelMapper;

	public CourseMapperImp() {
		modelMapper = new ModelMapper();
	}

	@Override
	public  Course dtoToDomain(CouDTO Course) {
		return modelMapper.map(Course,Course.class );

	}


	@Override
	public  CouDTO domainToDto(Course Course) {
		return modelMapper.map(Course,CouDTO.class );


	}


}



