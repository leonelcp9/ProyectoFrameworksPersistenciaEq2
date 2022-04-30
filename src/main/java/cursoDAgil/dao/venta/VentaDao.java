package cursoDAgil.dao.venta;

import java.util.List;

import cursoDAgil.bd.domain.Venta;

public interface VentaDao {
	List<Venta> listarTodasVentas();
	List<Venta> consultarVentaCliente(Integer clienteId);
	Integer altaVenta(Venta venta);
}