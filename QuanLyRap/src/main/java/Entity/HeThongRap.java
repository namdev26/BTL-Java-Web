package Entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
@Table(name = "HeThongRap")
public class HeThongRap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idHeThongRap")
    private String id;

    @Column(name = "tenHeThongRap")
    private String tenHeThongRap;

    @Column(name = "biDanh")
    private String biDanh;

    @Column(name = "logo")
    private String logo;

    @OneToMany(mappedBy = "heThongRap", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CumRap> cumRaps;
}