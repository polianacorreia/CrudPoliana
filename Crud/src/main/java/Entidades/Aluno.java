package Entidades;

public class Aluno implements Identificavel {
	
	private Long id;
	private String nome;
	private String matricula;
	
	
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
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Aluno(Long id, String nome, String matricula) {
		super();
		this.id = id;
		this.nome = nome;
		this.matricula = matricula;
	}
	
	
	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", matricula=" + matricula + "]";
	}
	
	
	
}
