package tn.esprit.cs.autoloc.domain;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "contract")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContract;

    @Column(nullable = false, length = 50)
    private String dateSignature;

    @Column(nullable = false, length = 50)
    private BigDecimal montantTotal;

    @Column(nullable = false, length = 50)
    private String valide;

}
