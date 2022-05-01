//////////////////////////////////
/* Equipo 2							*/
/* Autor: Mendez Gonzalez William	*/
/* Fecha: 26/04/2022				*/
///////////////////////////////////
package cursoDAgil.bd.mappers;
import java.util.List;
import java.util.Map;

import cursoDAgil.bd.domain.Cliente;


public interface ClienteMapper {
	List<Cliente> listarTodosClientes();
	Integer nuevoCliente(Cliente cliente);
	Cliente obtenerClientePorId(Map<String, Integer> mapCliente);
	Integer eliminarClientePorId(Integer idcliente);
	Integer actualizarClientePorID(Cliente cliente);
}
