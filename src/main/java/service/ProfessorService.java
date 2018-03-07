package sistema.service;

import java.util.ArrayList;
import sistema.modelos.Professor;

public class ProfessorService {
	//Atributos
	private ArrayList <Professor> professores = new ArrayList<Professor>();
	
	//Métodos
	public ProfessorService() {
		
	}
	public void salvar(Professor professor)
	{
	    professores.add(professor);
	}
	
	//Getters e Setters
	public ArrayList<Professor> getProfessores() {
		return professores;
	}
}