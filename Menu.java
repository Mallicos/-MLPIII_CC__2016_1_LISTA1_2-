package br.unipe.mlpIII.atividade2.Listas.modelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Menu {
	
	public void menuOpcoes(){
		
		Scanner input = new Scanner(System.in);
		int opcao = 0;
		List<Aluno> alunos = new ArrayList<>();
		
		do{
			
			System.out.println("*** Menu ***");
			System.out.println("Selecione uma opção");
			System.out.println("1. Incluir aluno");
			System.out.println("2. Remover aluno (por nome ou matricula)");
			System.out.println("3. Verificar se um aluno está matriculado (por matricula)");
			System.out.println("4. Listar todos os alunos aprovados(média superior à 7,0)");
			System.out.println("5. Listar todos os alunos reprovados por falta (faltas superior à 15)");
			System.out.println("6. Listar por ordem alfabética");
			System.out.println("0. SAIR");
			opcao = input.nextInt();
			
			switch(opcao){
			
			case 1:{
				
				System.out.println("informe o nome do aluno:");
				String nomeAluno = input.next();
				
				System.out.println("Informe a matricula do aluno:");
				String matriculaAluno = input.next();
				
				System.out.println("Informe a média do aluno:");
				float mediaAluno = input.nextInt();
				
				System.out.println("informe a quantidade de faltas do aluno:");
				int faltasAluno = input.nextInt();
				
				Aluno aluno = new Aluno(nomeAluno, matriculaAluno, mediaAluno, faltasAluno);
				aluno.setNome(nomeAluno);
				aluno.setMatricula(matriculaAluno);
				aluno.setMedia(mediaAluno);
				aluno.setFaltas(faltasAluno);
				
				alunos.add(aluno);				

				break;
				//XABLAAAAAAAAAAAAAAAAU
			}
			
			case 2:{
				
				System.out.println("informe a matricula ou nome do aluno que deseja remover:");
				String remover = input.next();
				
				for (int i = 0; i < alunos.size(); i++) {
					
					Aluno aluno = alunos.get(i);
					
					if(aluno.getNome().equals(remover)){
						alunos.remove(i);
						break;
					}
					
					else if(aluno.getMatricula().equals(remover)){
						alunos.remove(i);
						break;
					}
				}
				
				break;
				//XABLAAAAAAAAAAAAAAAAU
			}
			
			case 3:{
				
				System.out.println("Informe a matricula do aluno que deseja procurar:");
				String procurar = input.next();
				
				for (int i = 0; i < alunos.size(); i++) {
					
					Aluno aluno = alunos.get(i);
					
					if(aluno.getMatricula().equals(procurar)){
						System.out.println("O aluno " +aluno.getNome()+ " está na lista.");
						break;
					}
				}

				break;
				//XABLAAAAAAAAAAAAAAAAU
			}
			
			case 4:{
				
                    for (int i = 0; i < alunos.size(); i++) {
					
					Aluno aluno = alunos.get(i);
					
					   if(aluno.getMedia() > 7){
						  System.out.println(aluno.getNome());
					   }
                    }

				break;
				//XABLAAAAAAAAAAAAAAAAU
			}
			
			case 5:{
                   
				   for (int i = 0; i < alunos.size(); i++) {
					
					Aluno aluno = alunos.get(i);
					
					   if(aluno.getFaltas() > 15){
						  System.out.println(aluno.getNome());
					   }
                    }

				break;
			}
			
			case 6:{
				
				Collections.sort(alunos);
				System.out.println(alunos);

				break;
			}
			
			case 0:{
				System.out.println("FIM.");
				break;
			}
			
			default:{
				System.out.println("opção inválida, tente novamente.");
				break;
			}
			}
			
		}while(opcao != 0);
		
		input.close();
	}

}
