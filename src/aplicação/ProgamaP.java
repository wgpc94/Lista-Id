package aplicação;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


import entidades.Funcionarios;

public class ProgamaP {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		List<Funcionarios> lista = new ArrayList<>();
		System.out.println("Digite o numero de Funcionarios:");
		Integer n = entrada.nextInt();

		for(int i = 0; i < n; i++) {
			System.out.println("\nID do funcionario:");
			Integer id = entrada.nextInt();
			System.out.println("Nome: ");
			entrada.nextLine();
			String nome = entrada.nextLine();
			System.out.println("Salario: ");
			Double salario = entrada.nextDouble();
			Funcionarios funcionario = new Funcionarios(id, nome, salario);
			lista.add(funcionario);
		}

		for(Funcionarios x: lista) {
			System.out.println(x);
		}

		System.out.println("Digete o Id do funcionario:");
		Integer id = entrada.nextInt();
		Funcionarios pesquisar = lista.stream().filter(x-> x.getId()==id).findFirst().orElse(null);
		
		if (pesquisar == null) {
			System.out.println("Id nao existe");	
		}else {
			System.out.println("Digete a porcetagem de aumento:");
			double porcetagem = entrada.nextDouble();
			pesquisar.PorcetagemDeAumento(porcetagem);
			for(Funcionarios x: lista) {
				System.out.println(x);
			}
		}
	
		
		
		entrada.close();

	}

}
