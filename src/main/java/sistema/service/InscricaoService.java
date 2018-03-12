package sistema.service;

import java.util.ArrayList;
import java.util.List;
import sistema.modelos.Inscricao;

public class InscricaoService 
{
	private ArrayList <Inscricao> inscricoes=new ArrayList <Inscricao>();
	
	//Construtores
	public InscricaoService() {
	
	}
	
	//M�todos
	public void salvar(Inscricao inscricao)
	{
		inscricoes.add(inscricao);
	}
	
	public List <Inscricao> getInscricoes()
	{
		return inscricoes;
	}
}
