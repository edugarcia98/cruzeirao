package sistema.service;

import java.util.ArrayList;
import java.util.List;
import sistema.modelos.Rodada;

public class RodadaService 
{
	private ArrayList <Rodada> rodadas=new ArrayList <Rodada>();

	//Construtores
	public RodadaService() {
		
	}
	
	//Métodos
	public void salvar(Rodada rodada)
	{
		rodadas.add(rodada);
	}
	
	public List <Rodada> getRodadas()
	{
		return rodadas;
	}
}
