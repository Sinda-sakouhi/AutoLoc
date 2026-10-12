package tn.esprit.cs.autoloc.domain;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "client")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;

    @Column(nullable = true, length = 50)
    private String nom;

    @Column(nullable = true, length = 50)
    private String prenom;

    @Column(nullable = true, length = 50)
    private String email;

    @Column(nullable = true, length = 8)
    private String telephone;

    @Column(nullable = true, length = 50)
    private long numPermis;

    @Column(nullable = true, length = 50)
    private String dateInscription;
    @OneToMany(mappedBy = "client")
    List<Reservation> reservations;


    public Long getId() {
        return idClient;
    }

    public void setId(Long id) {
        this.idClient = id;
    }
}

