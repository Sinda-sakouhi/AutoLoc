package tn.esprit.cs.autoloc.domain;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "maintenance")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Maintenance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMaintenance;

    @Column(nullable = false, length = 50)
    private LocalDate dateDebut;

    @Column(nullable = false, length = 50)
    private LocalDate dateFin;

    @Column(nullable = false, length = 50)
    private String description;
    @ManyToOne
    Vehicule vehicule;

}