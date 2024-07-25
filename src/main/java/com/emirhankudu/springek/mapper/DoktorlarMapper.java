package com.emirhankudu.springek.mapper;

import com.emirhankudu.springek.DTO.DoctorlarDto;
import com.emirhankudu.springek.entity.doctorEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DoktorlarMapper {

    DoktorlarMapper INSTANCE = Mappers.getMapper(DoktorlarMapper.class);

    DoctorlarDto toDoktorlarDto(doctorEntity doctorEntity);

    List<DoctorlarDto> toDoktorlarDtoList(List<doctorEntity> doctorEntity);

}
