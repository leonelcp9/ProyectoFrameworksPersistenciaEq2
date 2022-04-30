package cursoDAgil.bd.domain;

public class Ganancia {
	private Integer idGanancia;
	private Integer ventaId;
	private Integer totalGanancia;
	private String fecha;
	public Integer getIdGanancia() {
		return idGanancia;
	}
	public void setIdGanancia(Integer idGanancia) {
		this.idGanancia = idGanancia;
	}
	public Integer getVentaId() {
		return ventaId;
	}
	public void setVentaId(Integer ventaId) {
		this.ventaId = ventaId;
	}
	public Integer getTotalGanancia() {
		return totalGanancia;
	}
	public void setTotalGanancia(Integer totalGanancia) {
		this.totalGanancia = totalGanancia;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
}
