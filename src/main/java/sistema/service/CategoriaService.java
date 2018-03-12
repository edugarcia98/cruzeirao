package sistema.service;

import java.util.ArrayList;
import java.util.List;
import sistema.modelos.Categoria;;

public class CategoriaService 
{
	private ArrayList <Categoria> categorias=new ArrayList <Categoria>();

	//Construtores
	public CategoriaService() {
	
	}
	
	//Métodos
	public void salvar(Categoria categoria)
	{
		categorias.add(categoria);
	}
	
	public List <Categoria> getCategorias()
	{
		return categorias;
	}
}
