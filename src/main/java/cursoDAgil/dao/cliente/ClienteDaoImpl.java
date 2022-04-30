package cursoDAgil.dao.cliente;

import java.io.Serializable;
import java.util.List;

import javax.inject.Named;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import cursoDAgil.bd.domain.Cliente;
import cursoDAgil.bd.mappers.ClienteMapper;

@Named
public class ClienteDaoImpl implements ClienteDao, Serializable {

	private static final long serialVersionUID = -6456965766968902300L;
	SqlSession sqlSession;
	@Autowired
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public List<Cliente> listarTodosClientes(){
		List<Cliente> list =null;
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			list=clienteMapper.listarTodosClientes();
			for(Cliente c:list) {
				System.out.println("Id: "+ c.getId());
				System.out.println("Nombre: " + c.getNombre());
				System.out.println("Direccion: "+ c.getDireccion().getCalle());
			}
			return list;
		}catch (Exception e) {
			System.out.println("Error: "+e);
		}
		return null;
	}
			
}
