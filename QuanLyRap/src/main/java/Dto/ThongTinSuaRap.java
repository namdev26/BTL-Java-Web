package Dto;

import org.springframework.web.multipart.MultipartFile;

public class ThongTinSuaRap {
    private String maHeThongRap;
    private String tenHeThongRap;
    private String biDanh;
    private MultipartFile logo; // là 1 interface thuộc springboot để upload các video hình ảnh
}
