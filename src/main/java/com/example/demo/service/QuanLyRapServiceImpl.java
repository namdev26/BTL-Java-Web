package com.example.demo.service;

import com.example.demo.dto.ResponseDto;
import com.example.demo.entity.*;
import com.example.demo.repository.RapRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;



@Service
public class QuanLyRapServiceImpl implements QuanLyRapService{
    private Logger logger = LoggerFactory.getLogger(QuanLyRapServiceImpl.class);
    @Autowired
    private RapRepository rapRepository;

    @Override
    public ResponseDto getHeThongRapByGroup(String group) {
        logger.info("Tìm hệ thống rạp thuộc nhóm " + group);
        ResponseDto responseDto = new ResponseDto();
        try {
            List<Rap> list = rapRepository.findByHeThongRapContainingIgnoreCaseAndMaNhom(group);
            responseDto.setContent(list);
            responseDto.setStatusCode(200);
            responseDto.setMessage("Xử lý thành công!");
            responseDto.setDateTime(LocalDateTime.now().toString());
            responseDto.setMessageConstants(null);
            logger.info("Lay du lieu Hệ thống rạp thành công");
        } catch (Exception e) {
            responseDto.setStatusCode(400);
            responseDto.setMessage("Không tìm thấy tài nguyên!");
            responseDto.setContent("");
            responseDto.setDateTime(LocalDateTime.now().toString());
            responseDto.setMessageConstants(null);
            logger.error("Lay du lieu hệ thống rạp thất: " + e.getMessage());
        }
        return responseDto;
    }

    @Override
    public ResponseDto getThongTinCumRapByGroup(String group) {
        logger.info("Tim thông tin cụm rạp co ma hệ thống " + group);
        ResponseDto responseDto = new ResponseDto();
        try {
            Rap rap = rapRepository.findById(group).get();
            responseDto.setContent(rap);
            responseDto.setStatusCode(200);
            responseDto.setMessage("Xử lý thành công!");
            responseDto.setDateTime(LocalDateTime.now().toString());
            responseDto.setMessageConstants(null);
            logger.info("Lay du lieu cụm rạp thanh cong");
        } catch (Exception e) {
            responseDto.setStatusCode(400);
            responseDto.setMessage("Không tìm thấy tài nguyên!");
            responseDto.setContent("Mã hệ thống rạp không hợp lệ");
            responseDto.setDateTime(LocalDateTime.now().toString());
            responseDto.setMessageConstants(null);
            logger.error("Lay du lieu cụm rạp that bai: " + e.getMessage());
        }
        return responseDto;
    }

}

