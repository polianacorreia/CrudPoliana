package Entidades;

public class Professor implements Identificavel {
	
	private Long id;
	private String nome;
	private String cpf;
	private String username;
	private String password;
	
	
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Professor(Long id, String nome, String cpf, String username, String password) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.username = username;
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return "Professor [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", username=" + username + ", password="
				+ password + "]";
	}

}
