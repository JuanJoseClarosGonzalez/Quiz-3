package IRepository;

import Document.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepository extends MongoRepository<Producto, String> {

}
