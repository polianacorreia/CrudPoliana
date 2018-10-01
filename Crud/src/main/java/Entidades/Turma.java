package Entidades;

import java.util.ArrayList;

public class Turma implements Identificavel {
	
	private Long id;
	private String nome;
	private ArrayList<Aluno> alunos;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
