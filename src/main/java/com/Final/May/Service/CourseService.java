package com.Final.May.Service;

import org.springframework.stereotype.Service;

import com.Final.May.ModelMapper.CourseMapperImp;
import com.Final.May.model.Course;
import com.Final.May.repository.CourseRepository;
import com.Final.MayDTO.CouDTO;

import lombok.AllArgsConstructor;


@AllArgsConstructor
	@Service
	public class CourseService {
		private CourseRepository courseRepository;
		 private static final CourseMapperImp CouMapper = new CourseMapperImp();
		 public CouDTO createCourseDTO(CouDTO CourseDTO) {
		  
		  Course course = Course.builder()
		                 
		                .courseID(CourseDTO.getCourseID())
		                .nameCourse(CourseDTO.getNameCourse())
		                .addedBy(CourseDTO.getAddedBy())
		                .startDate(CourseDTO.getStartDate())
		                .endDate(CourseDTO.getEndDate())
		                .nameInstittion(CourseDTO.getNameInstittion())
		                .courseAttch(CourseDTO.getCourseAttch())

		                


		                .build();
		  Course saveCourse = courseRepository.save(course);
		        return CouMapper.domainToDto(saveCourse);
		        
		    }

	}


