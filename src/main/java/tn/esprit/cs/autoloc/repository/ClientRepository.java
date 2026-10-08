package tn.esprit.cs.autoloc.repository;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.cs.autoloc.domain.Client;

public interface ClientRepository extends CrudRepository<Client, Long>
{
}
