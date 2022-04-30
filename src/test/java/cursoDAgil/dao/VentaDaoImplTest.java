package cursoDAgil.dao;

import static org.junit.Assert.assertEquals;

import java.sql.Date;
import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cursoDAgil.bd.domain.Cliente;
import cursoDAgil.bd.domain.Venta;
import cursoDAgil.dao.venta.VentaDao;




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class VentaDaoImplTest {
	@Inject
	VentaDao ventaDao;
	
	//@Test
	public void pruebaConsultarVentas() {
		System.out.println("Test consultar todas las ventas y los clientes a los que pertenece");
		try {
			List<Venta> lista = ventaDao.listarTodasVentas();
			assertEquals(lista.size(), 2);
		} catch (Exception ex) {
			System.out.println("error" + ex);
		}
	}
	@Test
	public void pruebaConsultarVentasCliente() {
		System.out.println("inicio de prueba CONSULTA POR CLIENTE");
		try {
			
			Integer id = 1 ;
			List<Venta> lista = ventaDao.consultarVentaCliente(id);
			assertEquals(lista.size(), 5);
		} catch (Exception ex) {
			System.out.println("error" + ex);
		}
	}
	@Test
	public void pruebaInsertarVenta() {
		System.out.println("Test insertar venta");
		try {
			
			Date date = new Date(System.currentTimeMillis());
			Venta venta = new Venta();
			venta.setClienteId(1);
			venta.setTotalVenta(900f);
			venta.setFecha(date);
			ventaDao.altaVenta(venta);
		}catch(Exception ex) {
			System.out.println("error" + ex);
		}
		System.out.println("Venta insertada con exito");
	}
}