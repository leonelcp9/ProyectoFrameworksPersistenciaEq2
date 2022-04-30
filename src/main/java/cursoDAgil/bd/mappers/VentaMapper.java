package cursoDAgil.bd.mappers;

import java.util.List;

import cursoDAgil.bd.domain.Venta;

public interface VentaMapper {
	List<Venta> listarTodasVentas();
	List<Venta> consultarVentaCliente(Integer clienteId);
	Integer altaVenta(Venta venta);
}
