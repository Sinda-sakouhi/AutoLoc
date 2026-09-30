package tn.esprit.cs.autoloc.domain;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "client")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idClient;

    @Column(nullable = false, length = 50)
    private String nom;

    @Column(nullable = false, length = 50)
    private String prenom;

    @Column(nullable = false, length = 50)
    private String email;

    @Column(nullable = false, length = 8)
    private String telephone;

    @Column(nullable = false, length = 50)
    private long numPermis;

    @Column(nullable = false, length = 50)
    private String dateInscription;

}
