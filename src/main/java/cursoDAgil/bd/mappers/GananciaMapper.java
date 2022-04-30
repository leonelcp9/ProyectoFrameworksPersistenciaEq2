package cursoDAgil.bd.mappers;

import java.util.List;
import java.util.Map;

import cursoDAgil.bd.domain.Ganancia;

public interface GananciaMapper {
	List<Ganancia> listarGanancia();
	Ganancia listarPorFecha(Map <String, String> mapGanancia);
}
