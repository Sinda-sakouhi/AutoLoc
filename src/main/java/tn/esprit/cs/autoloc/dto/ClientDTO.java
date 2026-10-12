package tn.esprit.cs.autoloc.dto;

import lombok.Data;

@Data
public class ClientDTO {
    private Long id;
    private String nom;
    private String prenom;
    private String email;
}