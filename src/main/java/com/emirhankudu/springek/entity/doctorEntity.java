package com.emirhankudu.springek.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "doktor")

public class doctorEntity {
    @Id
    @Column(name = "doc_id")
    private String id;
    @Column(name ="doc_name")
    private String name;
    @Column(name = "doc_contact_num")
    private Long num;
    @Column(name = "age")
    private int age;



}
