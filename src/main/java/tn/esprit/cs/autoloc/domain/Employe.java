package tn.esprit.cs.autoloc.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "employe")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEmploye;

    @Column(nullable = false, length = 50)
    private String nom;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 50)
    private RoleEmploye role;

    @Column(nullable = false, length = 50)
    private String email;

    @Column(nullable = false, length = 8)
    private String telephone;

    @Column(nullable = false, length = 50)
    private long numPermis;

    @Column(nullable = false, length = 50)
    private LocalDate dateInscription;
    @ManyToOne
    Agence agence;

}
