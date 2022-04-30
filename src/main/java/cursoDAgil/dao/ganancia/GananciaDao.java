package cursoDAgil.dao.ganancia;

import java.util.List;
import java.util.Map;

import cursoDAgil.bd.domain.Ganancia;

public interface GananciaDao {
	List<Ganancia> listarGanancia();
	Ganancia listarPorFecha(Map <String, String> mapGanancia);
}
