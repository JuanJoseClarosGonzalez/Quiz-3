package IRepository;

import Document.DetalleFactura;
import Document.Factura;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFacturaRepository extends MongoRepository<Factura, String> {
}
