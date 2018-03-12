package sistema.service;

import java.util.ArrayList;
import java.util.List;
import sistema.modelos.Equipe;

public class EquipeService
{
	private ArrayList <Equipe> equipes=new ArrayList <Equipe>();
	
	//Construtores
	public EquipeService() {
		
	}
	
	//Métodos
	public void salvar(Equipe equipe)
	{
		equipes.add(equipe);
	}
	
	public List <Equipe> getEquipes()
	{
		return equipes;
	}
}
