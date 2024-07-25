package com.emirhankudu.springek.repository;

import com.emirhankudu.springek.entity.doctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface DoctorRepository extends JpaRepository <doctorEntity,String> {
}
