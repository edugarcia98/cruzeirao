package sistema.service;

import java.util.ArrayList;
import java.util.List;
import sistema.modelos.Fase;

public class FaseService 
{
	private ArrayList <Fase> fases=new ArrayList <Fase>();

	//Construtores
	public FaseService() {
		
	}
	
	//Métodos
	public void salvar(Fase fase)
	{
		fases.add(fase);
	}
	
	public List <Fase> getFases()
	{
		return fases;
	}
}
