package tn.esprit.cs.autoloc.domain;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "agence")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence;

    @Column(nullable = false, length = 50)
    private String nom;

    @Column(nullable = false, length = 50)
    private String ville;

    @Column(nullable = false, length = 50)
    private String adresse;

    @Column(nullable = false, length = 50)
    private String telephone;

    @OneToMany (mappedBy = "agence")
    List<Vehicule> vehicules;

    @OneToMany (mappedBy = "agence")
    List<Employe> employees;
}
