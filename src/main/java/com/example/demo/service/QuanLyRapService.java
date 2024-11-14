package com.example.demo.service;


import com.example.demo.dto.ResponseDto;

public interface QuanLyRapService {
    ResponseDto getHeThongRapByGroup(String group);
    ResponseDto getThongTinCumRapByGroup(String group);
    //ResponseDto LayThongTinLichChieuHeThongRap(String maHeThongRap, String maNhom);
    //ResponseDto LayThongTinLichChieuPhim (String maPhim);
}
