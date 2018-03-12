package sistema.service;

import java.util.ArrayList;
import java.util.List;
import sistema.modelos.Juiz;

public class JuizService 
{
	private ArrayList <Juiz> juizes=new ArrayList <Juiz>();

	//Construtores
	public JuizService() {
		
	}
	
	//Métodos
	public void salvar(Juiz juiz)
	{
		juizes.add(juiz);
	}
	
	public List <Juiz> getJuizes()
	{
		return juizes;
	}
}
