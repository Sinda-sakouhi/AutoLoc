package tn.esprit.cs.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import tn.esprit.cs.autoloc.domain.Client;
import tn.esprit.cs.autoloc.dto.ClientDTO;
import tn.esprit.cs.autoloc.mapper.ClientMapper;
import tn.esprit.cs.autoloc.service.IClientService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Client")
public class ClientController {

    private final IClientService clientService;

    // GET : récupérer tous les clients
    @GetMapping
    public List<ClientDTO> getClients() {
        return clientService.retrieveAllClients()
                .stream()
                .map(ClientMapper::toDTO)
                .toList();
    }

    // GET : récupérer un client par ID
    @GetMapping("/{clientId}")
    public ClientDTO retrieveClient(
            @PathVariable("clientId") Long clientId) {

        Client client = clientService.retrieveClient(clientId);
        return ClientMapper.toDTO(client);
    }
// POST : ajouter un client
    @PostMapping
    public ClientDTO addClient(@RequestBody ClientDTO dto) {

        Client client = ClientMapper.toEntity(dto);

        // Affecter automatiquement la date d'inscription
        client.setDateInscription(
                new java.text.SimpleDateFormat("yyyy-MM-dd")
                        .format(new java.util.Date())
        );

        Client savedClient = clientService.addClient(client);

        return ClientMapper.toDTO(savedClient);
    }

    // DELETE : supprimer un client par ID
    @DeleteMapping("/{clientId}")
    public void removeClient(
            @PathVariable("clientId") Long clientId) {

        clientService.removeClient(clientId);
    }

    // PUT : modifier un client
    @PutMapping
    public ClientDTO updateClient(@RequestBody ClientDTO dto) {

        Client client = ClientMapper.toEntity(dto);
        Client updatedClient = clientService.updateClient(client);

        return ClientMapper.toDTO(updatedClient);
    }
}