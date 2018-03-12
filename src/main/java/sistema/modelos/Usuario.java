package sistema.modelos;

import java.util.List;

public class Usuario 
{
	private String email;
	private String nome;
	private List <Equipe> equipes;
	private List <Inscrito> inscricoes;
	private List <Campeonato> campeonatos;
	private Enum tipo;
	private String telFixo;
	private String telMovel;
	private String endereco;
	private String rg;
	private String cpf;
	private String cref;
	private Enum sexo;
	private String foto;
	
	//gets e sets
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Equipe> getEquipes() {
		return equipes;
	}
	public void setEquipes(List<Equipe> equipes) {
		this.equipes = equipes;
	}
	public List<Inscrito> getInscricoes() {
		return inscricoes;
	}
	public void setInscricoes(List<Inscrito> inscricoes) {
		this.inscricoes = inscricoes;
	}
	public List<Campeonato> getCampeonatos() {
		return campeonatos;
	}
	public void setCampeonatos(List<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
	}
	public Enum getTipo() {
		return tipo;
	}
	public void setTipo(Enum tipo) {
		this.tipo = tipo;
	}
	public String getTelFixo() {
		return telFixo;
	}
	public void setTelFixo(String telFixo) {
		this.telFixo = telFixo;
	}
	public String getTelMovel() {
		return telMovel;
	}
	public void setTelMovel(String telMovel) {
		this.telMovel = telMovel;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCref() {
		return cref;
	}
	public void setCref(String cref) {
		this.cref = cref;
	}
	public Enum getSexo() {
		return sexo;
	}
	public void setSexo(Enum sexo) {
		this.sexo = sexo;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
}
