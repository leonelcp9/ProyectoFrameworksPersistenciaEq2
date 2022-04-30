package cursoDAgil.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cursoDAgil.bd.domain.DetalleVentas;
import cursoDAgil.dao.detalleVentas.DetalleVentasDao;


	@RunWith(SpringJUnit4ClassRunner.class)
	@ContextConfiguration(locations = {"/applicationContext.xml"})
	public class DetalleVentasDaoImplTest {
		@Inject
		DetalleVentasDao detalleventasDao;
		
		@Test
		public void pruebaConsultarVentas() {
			System.out.println("Test consultar todas los detalles de ventas y los productos");
			try {
				List<DetalleVentas> lista = detalleventasDao.listarTodosDetalleVentas();
				assertEquals(lista.size(), 5);
			} catch (Exception ex) {
				System.out.println("error" + ex);
			}
		}
		
	}

