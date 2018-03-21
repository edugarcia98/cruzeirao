package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Local;
import sistema.service.LocalService;

@ManagedBean
@SessionScoped
public class LocalManagedBeans 
{
	private Local local=new Local();
	private LocalService service=new LocalService();
	
	public void salvar()
	{
		service.salvar(local);
		local=new Local();
	}

	//Gets e sets
	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}
	
	public List <Local> getLocais()
	{
		return service.getLocais();
	}
}
