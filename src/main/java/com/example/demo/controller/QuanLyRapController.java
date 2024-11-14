package com.example.demo.controller;

import com.example.demo.dto.ResponseDto;
import com.example.demo.service.QuanLyRapService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/QuanLyRap")

public class QuanLyRapController {
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private QuanLyRapService quanLyRapService;
    @GetMapping("/LayThongTinHeThongRap")
    public ResponseDto layThongTinHeThongRap(@RequestParam(required = false) String maHeThongRap){
        return quanLyRapService.getHeThongRapByGroup(maHeThongRap);
    }
    @GetMapping("/LayThongTinCumRapTheoHeThong")
    public ResponseDto layThongTinCumRapTheoHeThong(@RequestParam(name = "MaPhim") String maHeThongRap){
        return quanLyRapService.getThongTinCumRapByGroup(maHeThongRap);
    }
}
