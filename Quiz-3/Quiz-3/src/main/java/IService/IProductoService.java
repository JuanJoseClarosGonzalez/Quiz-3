package IService;

import Document.Producto;

import java.util.List;
import java.util.Optional;

public interface IProductoService {
  List<Producto> findAll(); // Devuelve una lista de productos
  Optional<Producto> findById(String id); // Devuelve un producto por su id
  Producto save(Producto producto); // Guarda un producto
  void update(Producto producto, String id); // Actualiza un producto
  void delete(String id); // Elimina un producto
}
