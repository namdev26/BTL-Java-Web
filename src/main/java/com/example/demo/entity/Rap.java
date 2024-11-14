package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "rap")

public class Rap {
    @Id
    @Column(name = "ma_rap")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String maRap;
    @Column(name = "ten_rap")
    private String tenRap;

    @ManyToOne
    @JoinColumn(name = "ma_cum_rap")
    private CumRap cumRap;
}
