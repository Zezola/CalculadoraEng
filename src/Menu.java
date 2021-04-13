import java.util.Scanner;

public class Menu {
	public short exibeMenu() {
		short opcao = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Escolha uma das opções abaixo.");
		System.out.println("0 - Sair");
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
		System.out.println("13 - Media Aritmetica");
		System.out.println("14 - Seno");
		System.out.println("15 - Cosseno");
		System.out.println("16 - Tangente");
		
		
		opcao = in.nextShort();
		
		return opcao;
	}
}
