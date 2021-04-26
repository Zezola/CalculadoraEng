import java.io.IOException;
import java.util.*;

public class Aplication {
	public static void main(String[] args)  {

		Scanner in = new Scanner(System.in);
		
		Menu menu = new Menu();

		short opcao = 0;
		int n = 0;
		double num1 = 0, num2 = 0, num3 = 0;
		do {
			
			try {
				opcao = menu.exibeMenu();
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		
		
		switch (opcao) {

		case 1:
			Calculadora somar = new Calculadora();
			System.out.print("Primeiro valor: ");
			num1 = in.nextDouble();
			System.out.print("Segundo valor: ");
			num2 = in.nextDouble();

			try {
				somar.somar(num1, num2);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;

		case 2:
			Calculadora subtracao = new Calculadora();
			System.out.print("Primeiro valor: ");
			num1 = in.nextDouble();
			System.out.print("Segundo valor: ");
			num2 = in.nextDouble();

			try {
				subtracao.subtrair(num1, num2);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

			break;

		case 3:
			Calculadora multiplica = new Calculadora();
			System.out.print("Primeiro valor: ");
			num1 = in.nextDouble();
			System.out.print("Segundo valor: ");
			num2 = in.nextDouble();

			try {
				multiplica.multiplicar(num1, num2);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			break;

		case 4:
			Calculadora dividir = new Calculadora();
			System.out.print("Primeiro valor: ");
			num1 = in.nextDouble();
			System.out.print("Segundo valor: ");
			num2 = in.nextDouble();

			try {
				dividir.divisao(num1, num2);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			break;

		case 5:
			Calculadora restoDivisao = new Calculadora();
			System.out.print("Primeiro valor: ");
			num1 = in.nextDouble();
			System.out.print("Segundo valor: ");
			num2 = in.nextDouble();

			try {
				restoDivisao.restoDivisao(num1, num2);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			break;
			
		case 6:
			num1 = 0;
			Calculadora elevaAoQuadrado = new Calculadora();
			System.out.print("Valor que desejamos elevar ao quadrado: ");
			num1 = in.nextDouble();
			
			try {
				elevaAoQuadrado.elevaAoQuadrado(num1);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		
		case 7:
			num1 = 0;
			Calculadora elevaAoCubo = new Calculadora();
			System.out.print("Valor que desejamos elevar ao cubo:");
			num1 = in.nextDouble();
			
			try {
				elevaAoCubo.elevaAoCubo(num1);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		
		case 8:
			num1 = num2 = 0;
			Calculadora exponenciacao = new Calculadora();
			System.out.print("Base: ");
			num1 = in.nextDouble();
			System.out.print("Expoente: ");
			num2 = in.nextDouble();
			
			try {
				exponenciacao.exponenciar(num1, num2);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;		
		
		case 9:
			Calculadora exponenciacaoBase10 = new Calculadora();
			System.out.print("Expoente: ");
			num1 = in.nextDouble();
			try {
				exponenciacaoBase10.exponenciar(10, num1);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		
		case 10:
			Calculadora logBase10 = new Calculadora();
			System.out.print("Logaritmando: ");
			num1 = in.nextDouble();
			try {
				logBase10.logBase10(num1);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		
		case 11:
			Calculadora logNatural = new Calculadora();
			System.out.print("Logaritmando: ");
			num1 = in.nextDouble();
			try {
				logNatural.logNatural(num1);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case 12:
			Calculadora fatorial = new Calculadora();
			System.out.println("Fatorial de: ");
			num1 = in.nextDouble();
			try {
				fatorial.fatorial(num1);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		
		case 13:
			Calculadora mediaAritmetica = new Calculadora();
			System.out.print("Numero de elementos: ");
			n = in.nextInt();
			try {
				mediaAritmetica.mediaAritmetica(n);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case 14:
			Calculadora seno = new Calculadora();
			System.out.print("Digite o cateto oposto: ");
			num1 = in.nextDouble();
			System.out.print("Digite a hipotenusa: ");
			num2 = in.nextDouble();
			try {
				seno.seno(num1, num2);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case 15:
			Calculadora cosseno = new Calculadora();
			System.out.print("Digite o cateto adjacente: ");
			num1 = in.nextDouble();
			System.out.print("Digite a hipotenusa: ");
			num2 = in.nextDouble();
			try {
				cosseno.cosseno(num1, num2);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case 16:
			Calculadora tangente = new Calculadora();
			System.out.print("Digite o cateto oposto: ");
			num1 = in.nextDouble();
			System.out.print("Digite o cateto adjacente: ");
			num2 = in.nextDouble();
			try {
				tangente.tangente(num1, num2);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case 17:                          
			Calculadora equacaoPrimeiroGrau = new Calculadora();                          
			System.out.println("Formula: ax + b = y\n");             
			System.out.print("Digite o valor de a: ");             
			num1 = in.nextDouble();             
			System.out.print("Digite o valor de b: ");             
			num2 = in.nextDouble();             
			System.out.print("Digite o valor de y: ");             
			num3 = in.nextDouble();                          
			try {
				equacaoPrimeiroGrau.equacaoPrimeiroGrau(num1, num2, num3);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}                          
			break;	
		
		case 18: 
			Calculadora equacaoSegundoGrau = new Calculadora();
			System.out.println("Formula geral: ax² + bx + c = 0");
			System.out.print("Entre com o coeficiente a: ");
			num1 = in.nextDouble();
			System.out.print("Entre com o coeficiente b: ");
			num2 = in.nextDouble();
			System.out.print("Entre com o coeficiente c: ");
			num3 = in.nextDouble();
			try {
				equacaoSegundoGrau.equacaoSegundoGrau(num1, num2, num3);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
			
		}

				
		} while(opcao != 0);
	}
	
	
	

}
