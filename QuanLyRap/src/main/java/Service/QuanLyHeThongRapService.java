package Service;

import Dto.ResponseDto;
import Dto.ThongTinTaoRap;
import Dto.ThongTinSuaRap;

public interface QuanLyHeThongRapService {
    ResponseDto layThongTinBoiHeThongRap(String maHeThongRap);
    ResponseDto layThongTinCumRapTheoHeThong (String maHeThongRap);
    ResponseDto layThongTinLichChieuHeThongRap (String maHeThongRap, String maNhom);
    ResponseDto layThongTinLichChieuPhim (int maPhim);
}
