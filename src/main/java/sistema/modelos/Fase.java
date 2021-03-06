package sistema.modelos;

import java.util.List;
import java.util.Date;

public class Fase 
{
	private Date dataInicio;
	private Date dataFim;
	private Enum formato;
	private Categoria categoria;
	private List <Grupo> grupos;
	private int numero;
	
	//gets e sets
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	public Enum getFormato() {
		return formato;
	}
	public void setFormato(Enum formato) {
		this.formato = formato;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public List<Grupo> getGrupos() {
		return grupos;
	}
	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
}
