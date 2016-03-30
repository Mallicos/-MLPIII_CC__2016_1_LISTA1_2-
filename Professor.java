package br.unipe.mlpIII.atividade2.Listas.modelo;

public class Professor {
	
	private String nome;
	private String matricula;
	private String especialidade;
	
	public Professor(String nome, String matricula, String especialidade){
		
		this.nome = nome;
		this.matricula = matricula;
		this.especialidade = especialidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	

}
