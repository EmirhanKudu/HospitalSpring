package com.emirhankudu.springek.Service;

import com.emirhankudu.springek.DTO.DoctorlarDto;
import com.emirhankudu.springek.entity.doctorEntity;
import com.emirhankudu.springek.mapper.DoktorlarMapper;
import com.emirhankudu.springek.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DoctorService {

    private final DoctorRepository doctorRepository;

    public List<DoctorlarDto> getAllDoctors() {
        List<doctorEntity> allDoctor = doctorRepository.findAll();
        return DoktorlarMapper.INSTANCE.toDoktorlarDtoList(allDoctor);

    }

}
