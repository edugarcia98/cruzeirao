package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Grupo;
import sistema.service.GrupoService;

@ManagedBean
@SessionScoped
public class GrupoManagedBeans 
{
	private Grupo grupo=new Grupo();
	private GrupoService service=new GrupoService();
	
	public void salvar()
	{
		service.salvar(grupo);
		grupo=new Grupo();
	}

	//Gets e sets
	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	
	public List <Grupo> getGrupos()
	{
		return service.getGrupos();
	}
}
