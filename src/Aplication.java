import java.io.IOException;
import java.util.*;

public class Aplication {
	public static void main(String[] args) throws IOException, InterruptedException {

		Scanner in = new Scanner(System.in);
		
		Menu menu = new Menu();

		short opcao = 0;
		int n = 0;
		double num1 = 0, num2 = 0;
		do {
			
			opcao = menu.exibeMenu();
		
		
		switch (opcao) {

		case 1:

			Calcula somar = new Calcula();
			System.out.print("Primeiro valor: ");
			num1 = in.nextDouble();
			System.out.print("Segundo valor: ");
			num2 = in.nextDouble();

			somar.somar(num1, num2);
			break;

		case 2:

			Calcula subtracao = new Calcula();
			System.out.print("Primeiro valor: ");
			num1 = in.nextDouble();
			System.out.print("Segundo valor: ");
			num2 = in.nextDouble();

			subtracao.subtrair(num1, num2);
			

			break;

		case 3:

			Calcula multiplica = new Calcula();
			System.out.print("Primeiro valor: ");
			num1 = in.nextDouble();
			System.out.print("Segundo valor: ");
			num2 = in.nextDouble();

			multiplica.multiplicar(num1, num2);

			break;

		case 4:

			Calcula dividir = new Calcula();
			System.out.print("Primeiro valor: ");
			num1 = in.nextDouble();
			System.out.print("Segundo valor: ");
			num2 = in.nextDouble();

			dividir.divisao(num1, num2);

			break;

		case 5:

			Calcula restoDivisao = new Calcula();
			System.out.print("Primeiro valor: ");
			num1 = in.nextDouble();
			System.out.print("Segundo valor: ");
			num2 = in.nextDouble();

			restoDivisao.restoDivisao(num1, num2);

			break;
			
		case 6:
			num1 = 0;
			Calcula elevaAoQuadrado = new Calcula();
			System.out.print("Valor que desejamos elevar ao quadrado: ");
			num1 = in.nextDouble();
			
			elevaAoQuadrado.elevaAoQuadrado(num1);
			break;
		
		case 7:
			num1 = 0;
			Calcula elevaAoCubo = new Calcula();
			System.out.print("Valor que desejamos elevar ao cubo:");
			num1 = in.nextDouble();
			
			elevaAoCubo.elevaAoCubo(num1);
			break;
		
		case 8:
			num1 = num2 = 0;
			Calcula exponenciacao = new Calcula();
			System.out.print("Base: ");
			num1 = in.nextDouble();
			System.out.print("Expoente: ");
			num2 = in.nextDouble();
			
			exponenciacao.exponenciacao(num1, num2);
			break;		
		
		case 9:
			Calcula exponenciacaoBase10 = new Calcula();
			System.out.print("Expoente: ");
			num1 = in.nextDouble();
			exponenciacaoBase10.exponenciacao(10, num1);
			break;
		
		case 10:
			Calcula logBase10 = new Calcula();
			System.out.print("Logaritmando: ");
			num1 = in.nextDouble();
			logBase10.logBase10(num1);
			break;
		
		case 11:
			Calcula logNatural = new Calcula();
			System.out.print("Logaritmando: ");
			num1 = in.nextDouble();
			logNatural.logNatural(num1);
			break;
			
		case 12:

			Calcula fatorial = new Calcula();
			System.out.println("Fatorial de: ");
			num1 = in.nextDouble();
			fatorial.fatorial((int)num1);
			break;
		
		case 13:
			Calcula mediaAritmetica = new Calcula();
			System.out.print("Numero de elementos: ");
			n = in.nextInt();
			mediaAritmetica.mediaAritmetica(n);
			break;
		case 14:
			Calcula seno = new Calcula();
			System.out.print("Digite o cateto oposto");
			num1 = in.nextDouble();
			System.out.print("Digite a hipotenusa");
			num2 = in.nextDouble();
			seno.seno(num1, num2);
			break;
		case 15:
			Calcula cosseno = new Calcula();
			System.out.print("Digite o cateto adjacente");
			num1 = in.nextDouble();
			System.out.print("Digite a hipotenusa");
			num2 = in.nextDouble();
			cosseno.cosseno(num1, num2);
			break;
		case 16:
			Calcula tangente = new Calcula();
			System.out.print("Digite o cateto oposto");
			num1 = in.nextDouble();
			System.out.print("Digite o cateto adjacente");
			num2 = in.nextDouble();
			tangente.tangente(num1, num2);
			break;
			
		}
				
		} while(opcao != 0);
	}
	
	
	

}
