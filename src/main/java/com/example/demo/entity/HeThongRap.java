package com.example.demo.entity;

import jakarta.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "heThongRap")

public class HeThongRap {
    @Id
    @Column(name = "ma_he_thong_rap")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String maHEThongRap;
    @Column(name = "ten_he_thong_rap")
    private String tenHeThongRap;
    @Column(name = "bi_danh")
    private String biDanh;
    @Column(name = "logo")
    private String logo;
}
