package exercicio_3;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		double N;
		int quociente, resto, nota, moeda;
		System.out.println("Qual foi o valor da Compra: ");
		Double valorTotal = sc.nextDouble();
		System.out.println("Qual foi o valor que o cliente pagou:");
		Double valorCliente = sc.nextDouble();
		Double troco = valorCliente - valorTotal;
//		N = sc.nextDouble();

		resto = (int) (troco * 100.0 + 0.5);

    	System.out.println("NOTAS:");
    
    		nota = 100;
    		quociente = resto / (nota * 100);
    		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
    		resto = resto % (nota * 100);
    
    		nota = 50;
    		quociente = resto / (nota * 100);
    		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
    		resto = resto % (nota * 100);
    
    		nota = 20;
    		quociente = resto / (nota * 100);
    		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
    		resto = resto % (nota * 100);
    		
    		nota = 10;
    		quociente = resto / (nota * 100);
    		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
    		resto = resto % (nota * 100);
    		
    		nota = 5;
    		quociente = resto / (nota * 100);
    		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
    		resto = resto % (nota * 100);
    		
    		nota = 2;
    		quociente = resto / (nota * 100);
    		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
    		resto = resto % (nota * 100);
    
    	        //Continue o seu código aqui
    
    
    		System.out.println("MOEDAS:");
    
    
    		moeda = 100;
    		quociente = resto / moeda;
    		System.out.println(quociente + " moeda(s) de R$ 1.00");
    		resto = resto % moeda;
    
    		moeda = 50;
    		quociente = resto / moeda;
    		System.out.println(quociente + " moeda(s) de R$ 0.50");
    		resto = resto % moeda;
    		
    		moeda = 25;
    		quociente = resto / moeda;
    		System.out.println(quociente + " moeda(s) de R$ 0.25");
    		resto = resto % moeda;
    		
    		moeda = 10;
    		quociente = resto / moeda;
    		System.out.println(quociente + " moeda(s) de R$ 0.10");
    		resto = resto % moeda;
    		
    		moeda = 5;
    		quociente = resto / moeda;
    		System.out.println(quociente + " moeda(s) de R$ 0.05");
    		resto = resto % moeda;
    
    		//continue o seu código aqui
    
    
    		moeda = 1;
    		quociente = resto / moeda;
    		System.out.println(resto + " moeda(s) de R$ 0.01");
    
    		sc.close();

	}

}
