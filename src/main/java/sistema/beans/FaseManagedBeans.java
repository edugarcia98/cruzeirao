package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Fase;
import sistema.service.FaseService;

@ManagedBean
@SessionScoped
public class FaseManagedBeans 
{
	private Fase fase=new Fase();
	private FaseService service=new FaseService();
	
	public void salvar()
	{
		service.salvar(fase);
		fase=new Fase();
	}

	//Gets e sets
	public Fase getFase() {
		return fase;
	}

	public void setFase(Fase fase) {
		this.fase = fase;
	}
	
	public List <Fase> getFases()
	{
		return service.getFases();
	}
}
