package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Equipe;
import sistema.service.EquipeService;

@ManagedBean
@SessionScoped
public class EquipeManagedBean 
{
	private Equipe equipe=new Equipe();
	private EquipeService service = new EquipeService();
	
	public void salvar()
	{
		service.salvar(equipe);
		equipe=new Equipe();
	}

	//Gets e sets
	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	
	public List <Equipe> getEquipes()
	{
		return service.getEquipes();
	}
}
