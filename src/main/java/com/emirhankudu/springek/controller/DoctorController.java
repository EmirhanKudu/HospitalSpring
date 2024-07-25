package com.emirhankudu.springek.controller;


import com.emirhankudu.springek.DTO.DoctorlarDto;
import com.emirhankudu.springek.Service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class DoctorController {

    private final DoctorService doctorService;

    @GetMapping("/doktorlar")
    public ResponseEntity<List<DoctorlarDto>> getAllDoctors() {
        List<DoctorlarDto> allDoctors = doctorService.getAllDoctors();
        return ResponseEntity.ok(allDoctors);
    }

}
