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

		}

	}
}
