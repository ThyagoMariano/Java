package Controle;

import java.util.Scanner;
import Modelo.Carro;
import Modelo.Cliente;

public class Main {

	public static void main(String[] args) 
	{

		java.util.Scanner input = new Scanner(System.in);
		Cliente cliente = new Cliente();
		
		System.out.println("Informe o CPF: ");
		String Cpf = input.next();
		
		System.out.println("Informe o Nome: ");
		String Nome = input.next();
		
		System.out.println("Informe o Endereço: ");
		String Endereço = input.next();
		
		System.out.println("Informe o Fone: ");
		String Fone = input.next();
		
		System.out.println("Informe o Email: ");
		String Email = input.next();
		
		cliente.setCpf(Cpf);
		cliente.setNome(Nome);
		cliente.setEndereço(Endereço);
		cliente.setFone(Fone);
		cliente.setEmail(Email);

		Carro carro = new Carro();

		System.out.println("Informe a placa do veiculo: ");
		String Placa = input.next();

		System.out.println("Informe o modelo do veiculo: ");
		String Modelo = input.next();
		
		System.out.println("Informe o ano do veiculo: ");
		int Ano = input.nextInt();
		
		System.out.println("Informe o fabricante do veiculo: ");
		String Fabricante= input.next();
		
		System.out.println("Informe a cor do veiculo: ");
		String Cor = input.next();
		
		carro.setPlaca(Placa);
		carro.setModelo(Modelo);
		carro.setAno(Ano);
		carro.setFabricante(Fabricante);
		carro.setCor(Cor);
		
		//Test
		System.out.println(carro.getPlaca());
		System.out.println(carro.getModelo());
		System.out.println(carro.getAno());
		System.out.println(cliente.getNome());

	}

}
