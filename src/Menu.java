import java.io.IOException;
import java.util.Scanner;

public class Menu {
	public short exibeMenu() throws IOException {
		short opcao = 0;
		Scanner in = new Scanner(System.in);
		Pausar pausar = new Pausar();
		LimparTela limparTela = new LimparTela();
		System.out.println("+-------------------------------------------------------------+");
		System.out.println("| 0- Sair \t\t\t\t\t\t      |");
		System.out.println("| 1- Somar  \t\t\t\t\t  2- Subtrair |");
		System.out.println("| 3- Multiplicar \t\t\t\t   4- Dividir |");
		System.out.println("| 5- Resto da divisão \t\t\t 6- Eleva ao quadrado |");
		System.out.println("| 7- Eleva ao cubo \t\t\t     8- Exponenciaçao |");
		System.out.println("| 9- Exponenciacao na base 10  \t     10- Logaritmo na base 10 |");
		System.out.println("| 11- Logaritmo natural (base e) \t\t 12- Fatorial |");
		System.out.println("| 13- Media Aritmetica \t\t\t\t     14- Seno |");
		System.out.println("| 15- Cosseno \t\t\t\t\t 16- Tangente |");
		System.out.println("| 17- Equacao do primeiro grau \t  18- Equacao do segundo grau |");
		System.out.println("+-------------------------------------------------------------+");
		System.out.print("\n \t\t     Escolha uma das opções:  ");
				
		opcao = in.nextShort();
		
		limparTela.limparTela();
		
		return opcao;
	}
	

}
