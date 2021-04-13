import java.util.*;

public class Aplication {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		short opcao = 0;
		double num1 = 0, num2 = 0;

		System.out.println("Escolha uma das opções abaixo");
		System.out.println("1- Somar");
		System.out.println("2- Subtrair");
		System.out.println("3- Multiplicar");
		System.out.println("4- Dividir");
		System.out.println("5- Resto da divisão");
		System.out.println("6 - Eleva ao quadrado");
		System.out.println("7 - Eleva ao cubo");
		System.out.println("8 - Exponenciaçao");
		System.out.println("9 - Exponenciacao na base 10");
		System.out.println("10 - Logaritmo na base 10");
		System.out.println("11 - Logaritmo natural (base e)");
		System.out.println("12 - Fatorial");
		opcao = in.nextShort();

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
			System.out.println("Valor que desejamos elevar ao quadrado: ");
			num1 = in.nextDouble();
			
			elevaAoQuadrado.elevaAoQuadrado(num1);
			break;
		
		case 7:
			num1 = 0;
			Calcula elevaAoCubo = new Calcula();
			System.out.println("Valor que desejamos elevar ao cubo:");
			num1 = in.nextDouble();
			
			elevaAoCubo.elevaAoCubo(num1);
			break;
		
		case 8:
			num1 = num2 = 0;
			Calcula exponenciacao = new Calcula();
			System.out.println("Base: ");
			num1 = in.nextDouble();
			System.out.println("Expoente: ");
			num2 = in.nextDouble();
			
			exponenciacao.exponenciacao(num1, num2);
			break;		
		
		case 9:
			Calcula exponenciacaoBase10 = new Calcula();
			System.out.println("Expoente: ");
			num1 = in.nextDouble();
			exponenciacaoBase10.exponenciacao(10, num1);
			break;
		
		case 10:
			Calcula logBase10 = new Calcula();
			System.out.println("Logaritmando: ");
			num1 = in.nextDouble();
			logBase10.logBase10(num1);
			break;
		
		case 11:
			Calcula logNatural = new Calcula();
			System.out.println("Logaritmando: ");
			num1 = in.nextDouble();
			logNatural.logNatural(num1);
			break;
			
		case 12:
			Calcula fatorial = new Calcula();
			System.out.println("Fatorial de: ");
			num1 = in.nextDouble();
			fatorial.fatorial((int)num1);
			break;

		}

	}
}
