package Repository;

import Entity.HeThongRap;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface RapRepository extends JpaRepository<HeThongRap, String>{
    List<HeThongRap> layThongTinHeThongRap (String maHeThongRap);
    List<HeThongRap> layThongTinHeThongRapTheoHeThong (String maHeThongRap);
    List<HeThongRap> layThongTinLichChieuHeThongRap (String maHeThongRap, String maNhom);
    List<HeThongRap> layThongTinLichChieuPhim (String maPhim);
}

