package Service;

import Document.Producto;
import IRepository.IProductoRepository;
import IService.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ProductoService implements IProductoService {

  //Conectar con los datos - IRepository
  // Inyección de dependencia
  @Autowired
  private IProductoRepository repository;


  @Override
  public List<Producto> findAll() {
    return repository.findAll();
  }

  @Override
  public Optional<Producto> findById(String id) {
    return repository.findById(id);
  }

  @Override
  public Producto save(Producto producto) {
    return repository.save(producto);
  }

  @Override
  public void update(Producto producto, String id) {
    //Obtener el objeto producto y el id
    //Verificar con el id, si exiten los datos
    Optional<Producto> ps = repository.findById(id);

    //Cargar nuevo objeto
    if (!ps.isEmpty()){
      Producto productoUpdate = ps.get();
      productoUpdate.setCodigo(producto.getCodigo());
      productoUpdate.setNombre(producto.getNombre());
      productoUpdate.setPrecio(producto.getPrecio());
      productoUpdate.setStock(producto.getStock());
      productoUpdate.setMarca(producto.getMarca());
      //Actualizar el objeto producto
      repository.save(productoUpdate);
    }else{
      System.out.println("No existe el producto");
    }
  }

  @Override
  public void delete(String id) {
    repository.deleteById(id);
  }
}
