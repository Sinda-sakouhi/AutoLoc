package tn.esprit.cs.autoloc.mapper;

import tn.esprit.cs.autoloc.domain.Client;
import tn.esprit.cs.autoloc.dto.ClientDTO;

public class ClientMapper {

    public static ClientDTO toDTO(Client client) {
        if (client == null) return null;

        ClientDTO dto = new ClientDTO();
        dto.setId(client.getIdClient());
        dto.setNom(client.getNom());
        dto.setPrenom(client.getPrenom());
        dto.setEmail(client.getEmail());

        return dto;
    }

    public static Client toEntity(ClientDTO dto) {
        if (dto == null) return null;

        Client client = new Client();
        client.setIdClient(dto.getId());
        client.setNom(dto.getNom());
        client.setPrenom(dto.getPrenom());
        client.setEmail(dto.getEmail());

        return client;
    }
}