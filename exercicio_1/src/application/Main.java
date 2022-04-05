package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entites.Pessoas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Pessoas> pessoas = new ArrayList<>();
		List <Pessoas> pessoas_50_anos = new ArrayList<>();
		List <Pessoas> pessoas_Altura_10_20 = new ArrayList<>();
		List <Pessoas> pessoas_peso_40_porcentagem = new ArrayList<>();

		

		Scanner sc = new Scanner(System.in);
		System.out.println("Programa para ler a altura e idade das pessoas");
		Pessoas pessoa1 = new Pessoas(20, 60.6,1.80);
		pessoas.add(pessoa1);
		
		Pessoas pessoa2 = new Pessoas(30, 70.2, 1.70);
		pessoas.add(pessoa2);

		Pessoas pessoa3 = new Pessoas(47, 60.0, 1.80);
		pessoas.add(pessoa3);
		
		Pessoas pessoa4 = new Pessoas(12, 35.0, 1.43); //pessoa 1
		pessoas.add(pessoa4);	
		
		Pessoas pessoa5 = new Pessoas(13, 35.0, 1.83); //pessoa 2
		pessoas.add(pessoa5);	
	
		Pessoas pessoa6 = new Pessoas(33, 73.0, 1.73);
		pessoas.add(pessoa6);
	
		Pessoas pessoa7 = new Pessoas(11, 36.0, 1.42); //pessoa 3
		pessoas.add(pessoa7);
	
		Pessoas pessoa8 = new Pessoas(39, 75.3, 1.52);
		pessoas.add(pessoa8);
	
		Pessoas pessoa9 = new Pessoas(78, 85.2, 1.65);
		pessoas.add(pessoa9);
	
		Pessoas pessoa10 = new Pessoas(66, 62.6, 1.59);
		pessoas.add(pessoa10);
	
		
		System.out.println("Pessoas cadastradas: " + pessoas.size());
		
		
		for(Pessoas x : pessoas)
		if(x.getIdade() > 50) {
			pessoas_50_anos.add(x);
		}
		System.out.println("Pessoas com mais de 50 anos: " + pessoas_50_anos.size());
		
		
//		calculo para média de altura entre pessoas da idade x e idade y
		
		for(Pessoas x : pessoas)
			if(x.getIdade() < 20 && x.getIdade() >= 10) {
				pessoas_Altura_10_20.add(x);
			}
		System.out.println("Pessoas entre 10 e 20 anos: "
				 + pessoas_Altura_10_20.size());
		
		double soma = 0;
		for(Pessoas x : pessoas_Altura_10_20) {
			soma += x.getAltura();
			}
		
		double media = soma / pessoas_Altura_10_20.size();
	
		System.out.printf("Altura média dessas "+pessoas_Altura_10_20.size()+  " Pessoas: %.2f \n", media );
		
//		calculo para a porcentagem de pessoas com menos de 40 quilos;
		
		for(Pessoas x : pessoas)
			if(x.getPeso() < 40) {
				pessoas_peso_40_porcentagem.add(x);
			}
		int quantidadeDePessoas = pessoas_peso_40_porcentagem.size() ;
		System.out.println("Numero de pessoas com menos de 40 quilos: " + quantidadeDePessoas);
		Double porcentagem = (double) (quantidadeDePessoas * 100 / pessoas.size());
		System.out.println("Percentual: " + porcentagem + "%");
	}

}
