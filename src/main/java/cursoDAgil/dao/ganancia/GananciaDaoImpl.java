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
	@Override
	
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
	
	public Ganancia listarPorFecha(Map <String, String> mapGanancia) {
		try {
			GananciaMapper gananciaMapper = sqlSession.getMapper(GananciaMapper.class);
			Ganancia ganancia = new Ganancia();
			ganancia = gananciaMapper.listarPorFecha(mapGanancia);
			System.out.println("ID Ganancia: " + ganancia.getIdGanancia());
			System.out.println("Venta id: " + ganancia.getVentaId());
			System.out.println("Total ganancias: " + ganancia.getTotalGanancia());
			System.out.println("Fecha: " + ganancia.getFecha());
			
		}catch(Exception e) {
			System.out.println("Error: "+e);
		}
		return null;
	}

}
