package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Professor;
import sistema.service.ProfessorService;

@ManagedBean
@SessionScoped
public class ProfessorManagedBean {
	//Atributos
	private Professor professor = new Professor();
	private ProfessorService service = new ProfessorService();
	
	//Métodos
	public void salvar()
	{
		service.salvar(professor);
		professor = new Professor();
	}
	
	//Getters e Setters
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public List<Professor> getProfessores() {
		return service.getProfessores();
	}
}