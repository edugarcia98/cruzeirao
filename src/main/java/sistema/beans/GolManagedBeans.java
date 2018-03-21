package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Gol;
import sistema.service.GolService;

@ManagedBean
@SessionScoped
public class GolManagedBeans 
{
	private Gol gol=new Gol();
	private GolService service=new GolService();
	
	public void salvar()
	{
		service.salvar(gol);
		gol=new Gol();
	}

	//Gets e sets
	public Gol getGol() {
		return gol;
	}

	public void setGol(Gol gol) {
		this.gol = gol;
	}
	
	public List <Gol> getGols()
	{
		return service.getGols();
	}
}
