package Modelo;

public class Cliente 
{

	private String Cpf;
	private String Nome;
	private String Endereço;
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

	public String getEndereço() {
		return Endereço;
	}

	public void setEndereço(String endereço) {
		Endereço = endereço;
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
