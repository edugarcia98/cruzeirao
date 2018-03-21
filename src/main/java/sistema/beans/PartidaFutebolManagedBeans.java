package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.PartidaFutebol;
import sistema.service.PartidaFutebolService;

@ManagedBean
@SessionScoped
public class PartidaFutebolManagedBeans 
{
	private PartidaFutebol partidaFutebol=new PartidaFutebol();
	private PartidaFutebolService service=new PartidaFutebolService();
	
	public void salvar()
	{
		service.salvar(partidaFutebol);
		partidaFutebol=new PartidaFutebol();
	}

	//Gets e sets
	public PartidaFutebol getPartidaFutebol() {
		return partidaFutebol;
	}

	public void setPartidaFutebol(PartidaFutebol partidaFutebol) {
		this.partidaFutebol = partidaFutebol;
	}
	
	public List <PartidaFutebol> getPartidasFutebol()
	{
		return service.getPartidasFutebol();
	}
}
