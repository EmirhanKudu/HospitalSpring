package com.emirhankudu.springek.repository;

import com.emirhankudu.springek.entity.hastaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HastaRepository extends JpaRepository <hastaEntity,String> {
}
