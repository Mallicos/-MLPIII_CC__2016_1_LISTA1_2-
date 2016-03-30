package br.unipe.mlpIII.atividade2.Listas.modelo;

import br.unipe.mlpIII.Listas.modelo.Item;

public class Aluno implements Comparable<Aluno>{
	
	private String nome;
	private String matricula;
	private float media;
	private int faltas;
	
	public Aluno(String nome, String matricula, float media, int faltas){
		
		this.nome = nome;
		this.matricula = matricula;
		this.media = media;
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

	public float getMedia() {
		return media;
	}

	public void setMedia(float media) {
		this.media = media;
	}
	
	public float getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}
	
	public String toString(){
		return this.nome+", "+this.matricula+", "+this.media+", "+this.faltas;
	}
	
	public int compareTo(Aluno aluno) {
		return -1;
	}

//	@Override
//	public int compareTo(Aluno arg0) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
}
