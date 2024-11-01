package Entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
@Table(name = "CumRap")
public class CumRap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCumRap")
    private String id;

    @Column(name = "tenCumRap")
    private String tenCumRap;

    @Column(name = "diaChi")
    private String diaChi;

    @ManyToOne
    @JoinColumn(name = "heThongRap_id")
    private HeThongRap heThongRap;

    @OneToMany(mappedBy = "cumRap", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Rap> raps;
}