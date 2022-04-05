package program;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List <String> letras = new ArrayList <> ();
		letras.add("a");
		letras.add("b");
		letras.add("c");
		letras.add("d");
		letras.add("e");
		letras.add("f");
		letras.add("g");
		letras.add("h");
		letras.add("i");
		letras.add("j");
		letras.add("k");
		letras.add("l");
		letras.add("m");
		letras.add("n");
		letras.add("o");
		letras.add("p");
		letras.add("q");
		letras.add("r");
		letras.add("s");
		letras.add("t");	
		letras.add("u");
		letras.add("v");
		letras.add("w");
		letras.add("x");
		letras.add("y");
		letras.add("z");
	
		
		System.out.println("Digite a Primeira Letra");
		String letra1 = sc.next();
		System.out.println("esta letra está na posição: " + letras.indexOf(letra1));

		System.out.println("Digite a Segunda Letra");
		String letra2 = sc.next();
		System.out.println("esta letra está na posição: " + letras.indexOf(letra2));
		
		int posicaoLetra1 = letras.indexOf(letra1) + 1;
		int posicaoLetra2 = letras.indexOf(letra2) + 1;
		
		if (posicaoLetra2 < posicaoLetra1 ) {
			System.out.println(" Não está em ordem alfabética ");
		} else {
			System.out.println("está na ordem correta");
			int distancia = (posicaoLetra2 - posicaoLetra1) - 1;
			System.out.println("A distancia entre as duas letras é de: " + distancia);
		}

	}

}
