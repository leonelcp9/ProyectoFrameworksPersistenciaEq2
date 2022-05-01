//////////////////////////////////
/* Equipo 2							*/
/* Autor: Mendez Gonzalez William	*/
/* Fecha: 28/04/2022				*/
/////////////////////////////////// 
package cursoDAgil.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cursoDAgil.bd.domain.Direccion;
import cursoDAgil.dao.direccion.DireccionDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml"})
public class DireccionDaoImplTest {
	@Inject
	DireccionDao direccionDao;
	@Test
	public void consultarDireccionPorId(){
		Direccion direccion = new Direccion();
		Map<String, Integer> mapDireccion = new HashMap<>();
		mapDireccion.put("idDireccion",1);
		try{
			direccion=direccionDao.obtenerDireccionPorId(mapDireccion);
			assertNotNull(direccion);
			System.out.println("id:" + direccion.getIddireccion());
			System.out.println("calle:" + direccion.getCalle());
			}catch(Exception e){
			System.out.println("Error: " + e);
		}
	}
	@Test
	public void pruebaConsultarTodo(){
		int reg;
		System.out.println("Test consultar todas las direcciones");
	
		try{
			List<Direccion> lista = direccionDao.obtenerDirecciones();
			reg=lista.size();
			assertEquals(lista.size(),reg);
			System.out.println("\nRegistros en la tabla: " + reg);
		}catch(Exception ex){
			System.out.println("error" + ex);
		}
	}
	@Ignore
	public void nuevoRegistro(){
		Direccion direccion= new Direccion();
		System.out.println("Test nuevo registro");
		try{
			direccion.setCalle("Micaela Galindo");
			direccion.setNumero(3);
			direccion.setColonia("Centro");
			direccion.setCiudad("Huajuapan");
			direccion.setEstado("Oaxaca");
			direccion.setPais("Mexico");
			direccion.setCodigoPostal(69000);
			direccionDao.nuevaDireccionCliente(direccion);
		}catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}
	@Ignore
	public void eliminardireccion() {
		System.out.println("Test eliminar Direccion");
		try {
			direccionDao.eliminarDireccionPorId(2);
		}catch(Exception e){
			System.out.println("Error"+ e );
		}
	}
	@Ignore
	public void actualizarDireccion() {
		System.out.println("Test Actualizar Direccion");
		Map<String, Integer> mapDireccion = new HashMap<>();
		Direccion direccion= new Direccion();
		mapDireccion.put("idDireccion",2);
		try {
			direccion.setIdDireccion(2);
			direccion.setCalle("Micaela GUERRERO");
			direccion.setNumero(3);
			direccion.setColonia("Alta Vista");
			direccion.setCiudad("Huajuapan");
			direccion.setEstado("Oaxaca");
			direccion.setPais("Mexico");
			direccion.setCodigoPostal(69005);
			
			direccionDao.actualizarDireccionPorID(direccion);
			System.out.println("DireccionActualizada");
		}catch(Exception e) {
			System.out.println("Error"+e);
		}
	}
	
}
