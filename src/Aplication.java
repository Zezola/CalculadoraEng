import java.util.*;

public class Aplication {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		 short opcao = 0;
		
		System.out.println("Escolha uma das opções abaixo");
		System.out.println("1- Somar");
		System.out.println("2- Subtrair");
		System.out.println("3- Multiplicar");
		System.out.println("4- Dividir");
		opcao = in.nextShort();
		
		switch(opcao) {
		
		case 1:
			
			double num1,  num2;
			Somar result = new Somar();
				System.out.print("Primeiro valor: ");
				num1 = in.nextDouble();
				System.out.print("Segundo valor: ");
				num2 = in.nextDouble();
				
				System.out.println(result.somatorio(num1, num2));
				
			break;
		}
	}
}
