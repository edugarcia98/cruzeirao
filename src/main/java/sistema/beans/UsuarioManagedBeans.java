package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Usuario;
import sistema.service.UsuarioService;

@ManagedBean
@SessionScoped
public class UsuarioManagedBeans 
{
	private Usuario usuario=new Usuario();
	private UsuarioService service=new UsuarioService();
	
	public void salvar()
	{
		service.salvar(usuario);
		usuario=new Usuario();
	}

	//Gets e sets
	public UsuarioService getService() {
		return service;
	}

	public void setService(UsuarioService service) {
		this.service = service;
	}
	
	public List <Usuario> getUsuario()
	{
		return service.getUsuarios();
	}
}
