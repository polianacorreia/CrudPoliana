package Entidades;

public interface Cadastro {
	
	//Aluno\\
	
	public void addAluno(Long id, String nome, String matricula);
	
	public void removeAluno(Long id);
	
	public Aluno buscarAluno(String nome, Long id);
	
	
}
