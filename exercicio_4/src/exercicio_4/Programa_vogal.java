package exercicio_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa_vogal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Programa para mostrar Vogal: ");
		System.out.println("Insira uma letra: ");
		String letra = sc.next();
		letra.toUpperCase();

		List <String> list = new ArrayList <>();
		list.add("A");
		list.add("E");
		list.add("I");
		list.add("O");
		list.add("U");
		
		
		if (list.contains(letra)) {
			System.out.println("é uma vogal");
		} else { 
			System.out.println("é uma consoante");
			
		}
		
		
	}

}
