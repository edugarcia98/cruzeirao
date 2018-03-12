package sistema.service;

import java.util.ArrayList;
import java.util.List;
import sistema.modelos.Cartao;

public class CartaoService 
{
	private ArrayList <Cartao> cartoes=new ArrayList <Cartao>();

	//Construtores
	public CartaoService() {
	
	}
	
	//Métodos
	public void salvar(Cartao cartao)
	{
		cartoes.add(cartao);
	}
	
	public List <Cartao> getCartoes()
	{
		return cartoes;
	}
}
