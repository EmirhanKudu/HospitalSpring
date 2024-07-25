package com.emirhankudu.springek.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Hasta")
// veri eslestirme

public class hastaEntity {

    @Id
    @Column(name = "hasta_id")
    private int hasta_id;
    @Column(name = "hasta_name")
    private String hasta_name;

    @ManyToOne
    @JoinColumn(name = "doc_id")
    private doctorEntity doctorEntity;
}
