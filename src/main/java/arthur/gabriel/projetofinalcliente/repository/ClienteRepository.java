package arthur.gabriel.projetofinalcliente.repository;

import arthur.gabriel.projetofinalcliente.model.ClienteEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<ClienteEntity, Long> {


}
