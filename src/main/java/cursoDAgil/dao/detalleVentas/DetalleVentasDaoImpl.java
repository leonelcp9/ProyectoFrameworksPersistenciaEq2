package cursoDAgil.dao.detalleVentas;

import java.io.Serializable;
import java.util.List;

import javax.inject.Named;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import cursoDAgil.bd.domain.DetalleVentas;
import cursoDAgil.bd.domain.Venta;
import cursoDAgil.bd.mappers.DetalleVentasMapper;
import cursoDAgil.bd.mappers.VentaMapper;
import cursoDAgil.dao.venta.VentaDao;

@Named
public class DetalleVentasDaoImpl implements DetalleVentasDao, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	SqlSession sqlSession;
	@Autowired
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	@Override
	public List<DetalleVentas> listarTodosDetalleVentas() {
		List<DetalleVentas> list = null;
		try {
			DetalleVentasMapper detalleVentasMapper = sqlSession.getMapper(DetalleVentasMapper.class);
			list = detalleVentasMapper.listarTodosDetalleVentas();
			for(DetalleVentas ven:list) {
				System.out.println("ventaId: "+ ven.getVenvtaId());
				System.out.println("productoId: "+ ven.getProductoId());
				System.out.println("totalVenta: "+ ven.getCantidad());
				System.out.println("Producto(idProduto): "+ ven.getProducto().getIdProducto());
				System.out.println("Producto(nombre): "+ ven.getProducto().getNombre());
				System.out.println("Producto(precio): "+ ven.getProducto().getPrecio());
				System.out.println("Producto(precioVta): "+ ven.getProducto().getPrecioVta());
				System.out.println("Producto(cantidad): "+ ven.getProducto().getCantidad());
				System.out.println("Producto(marcaId): "+ ven.getProducto().getMarcaId());
				System.out.println();
			}
			return list;
		}catch (Exception e) {
			System.out.println("Error: "+ e);
		}
		return null;
	}
	
}
