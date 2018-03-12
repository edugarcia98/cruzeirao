package sistema.service;

import java.util.ArrayList;
import java.util.List;
import sistema.modelos.Gol;

public class GolService 
{
	private ArrayList <Gol> gols=new ArrayList <Gol>();

	//Construtores
	public GolService() {
		
	}
	
	//M�todos
	public void salvar(Gol gol)
	{
		gols.add(gol);
	}
	
	public List <Gol> getGols()
	{
		return gols;
	}
}
