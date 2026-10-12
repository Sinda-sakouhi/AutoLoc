package tn.esprit.cs.autoloc.service;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.cs.autoloc.domain.Client;
import java.util.List;

public interface IClientService {
        List<Client> retrieveAllClients();
        Client addClient(Client e);
        Client updateClient(Client e);
        Client retrieveClient(Long idClient);
        void removeClient(Long idClient);
        List<Client> addClients (List<Client> Clients);

    }
