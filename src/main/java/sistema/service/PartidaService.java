package sistema.service;

import java.util.ArrayList;
import java.util.List;
import sistema.modelos.Partida;

public class PartidaService 
{
	private ArrayList <Partida> partidas=new ArrayList <Partida>();

	//Construtores
	public PartidaService() {
		
	}
	
	//M�todos
	public void salvar(Partida partida)
	{
		partidas.add(partida);
	}
	
	public List <Partida> getPartidas()
	{
		return partidas;
	}
}
