package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Terceirizado;
import entities.Trabalhador;

public class Aplicacao {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Trabalhador> lista = new ArrayList<>();
		Trabalhador t;
		System.out.print("Digite o número de trabalhadores: ");
		int quantidade = s.nextInt();
		
		for(int i = 0; i< quantidade ; i++) {
			System.out.print("Trabalhador número: "+ i);
			System.out.println("Terceirizado? (S/N)");
			String terceirizado = s.next();
			System.out.print("Nome: ");
			String nome = s.next();
			System.out.print("Hora: ");
			int horas = s.nextInt();
			System.out.print("Valor Por Hora: ");
			double valorPorHora = s.nextDouble();
			if(terceirizado.equals("N")) {
				t = new Trabalhador(nome, valorPorHora, horas);
			}else {
				System.out.println("Adicional");
				double adicional = s.nextDouble();
				t = new Terceirizado(nome, valorPorHora, horas, adicional);
			}
			lista.add(t);
			
		}
		
		System.out.println("\nPAGAMENTOS");
		for(Trabalhador t : lista ) {
			System.out.println(t.getNome()+ " - $" + String.format("%.2f", t.pagamento()));
		}
		
		s.close();
	}
}
