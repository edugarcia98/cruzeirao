package sistema.service;

import java.util.ArrayList;
import java.util.List;
import sistema.modelos.Campeonato;

public class CampeonatoService 
{
	private ArrayList <Campeonato> campeonatos=new ArrayList<Campeonato>();

	//Construtores
	public CampeonatoService() {
	
	}
	
	//Métodos
	public void salvar(Campeonato campeonato)
	{
		campeonatos.add(campeonato);
	}
	
	public List <Campeonato> getCampeonatos()
	{
		return campeonatos;
	}
}
