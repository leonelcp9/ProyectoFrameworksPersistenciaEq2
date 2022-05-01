package cursoDAgil.dao.ganancia;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.inject.Named;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import cursoDAgil.bd.domain.Ganancia;
import cursoDAgil.bd.mappers.GananciaMapper;



@Named
public class GananciaDaoImpl implements GananciaDao, Serializable{
	private static final long serialVersionUID = -6456965766968902300L;
	SqlSession sqlSession;
	@Autowired
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public List<Ganancia> listarGanancia() {
		// TODO Auto-generated method stub
		List<Ganancia> list = null;
		try {
			GananciaMapper gananciaMapper = sqlSession.getMapper(GananciaMapper.class);
			list = gananciaMapper.listarGanancia();
			for(Ganancia c:list) {
				System.out.println("ID ganancia: "+ c.getIdGanancia());
				System.out.println("ID venta: "+c.getVentaId());
				System.out.println("Total ganancia: "+c.getTotalGanancia());
				System.out.println("Fecha: "+c.getFecha());
				System.out.println();
			}
			return list;
		}catch(Exception e){
			System.out.println("Error: "+ e);
		}
		return null;
	}
	
	public List<Ganancia> listarPorFecha(Map <String, String> mapGanancia) {
		List<Ganancia> list = null;
		try {
			GananciaMapper gananciaMapper = sqlSession.getMapper(GananciaMapper.class);
			list = gananciaMapper.listarPorFecha(mapGanancia);
			
			for(Ganancia g:list) {
				System.out.println("ID Ganancia: " + g.getIdGanancia());
				System.out.println("Venta id: " + g.getVentaId());
				System.out.println("Total ganancias: " + g.getTotalGanancia());
				System.out.println("Fecha: " + g.getFecha());
			}
			
			
		}catch(Exception e) {
			System.out.println("Error: "+e);
		}
		return null;
	}

}
