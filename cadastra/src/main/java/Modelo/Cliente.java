package Modelo;

public class Cliente 
{

	private String Cpf;
	private String Nome;
	private String Enderešo;
	private String Fone;
	private String Email;
	
	public Cliente() 
	{
		super();
	}

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getEnderešo() {
		return Enderešo;
	}

	public void setEnderešo(String enderešo) {
		Enderešo = enderešo;
	}

	public String getFone() {
		return Fone;
	}

	public void setFone(String fone) {
		Fone = fone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
	
}
