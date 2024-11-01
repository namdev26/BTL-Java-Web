package Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Rap")
public class Rap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRap")
    private String id;

    @Column(name = "tenRap")
    private String tenRap;

    @ManyToOne
    @JoinColumn(name = "cumRap_id")
    private CumRap cumRap;
}