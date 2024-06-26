package IRepository;

import Document.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteRepository extends MongoRepository<Cliente, String> {
}
