package br.unipe.mlpIII.atividade2.Listas.modelo;

import java.util.List;

public class Curso {
	
	private List<Aluno> alunos;
	private List<Professor> professor;
	private String nome;
	private int numero;
	
	public Curso(List<Aluno> alunos, List<Professor> professor, String nome, int numero){
		
		this.alunos = alunos;
		this.professor = professor;
		this.nome = nome;
		this.numero = numero;
	}
}
