package com.example.demo.entity;

import jakarta.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "cumRap")

public class CumRap {
    @Id
    @Column(name = "ma_cum_rap")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String maCumRap;
    @Column(name = "ten_cum_rap")
    private String tenCumRap;
    @Column(name = "dia_chi")
    private String diaChi;

    @ManyToOne
    @JoinColumn(name = "ma_he_thong_rap")
    private HeThongRap heThongRap;
}
