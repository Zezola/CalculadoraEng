import java.io.IOException;
import java.util.*;


public class Calcula {
	
	Scanner in = new Scanner(System.in);
	Pausar pausar = new Pausar();
	LimparTela limparTela = new LimparTela();
	
	public void somar(double num1, double num2) throws IOException {
		double result;
		
				
		result = num1 + num2;
		System.out.println();
		System.out.println(num1+ " + " +num2+ " = " +result);
		System.out.println();
		pausar.pausar();
		limparTela.limparTela();
	}
	
	public void subtrair(double num1, double num2) throws IOException {
		double result;
		
		result = num1 - num2;
		System.out.println();
		System.out.println(num1 +" - " +num2+ " = " +result);
		System.out.println();
		pausar.pausar();
		limparTela.limparTela();
	}
	
	public void multiplicar(double num1, double num2) throws IOException {
		double result;
		
		result = num1 * num2;
		
		System.out.println();
		System.out.println(num1 +" * " +num2+ " = " +result);
		System.out.println();
		pausar.pausar();
		limparTela.limparTela();
	}
	
	public void divisao(double num1, double num2) {
		double result;
		
		result = num1 / num2;
		
		System.out.println();
		System.out.println(num1 +" / " +num2+ " = " +result);
		System.out.println();
	}
	
	public void restoDivisao(double num1, double num2) throws IOException {
		double result;
		
		result = num1 % num2;
		
		System.out.println();
		System.out.println("Resto da divisao de " +num1+ " por " +num2+ " = " +result);
		System.out.println();
		pausar.pausar();
		limparTela.limparTela();
	}
	
	public void elevaAoQuadrado(double num1) throws IOException {
		double result = Math.pow(num1, 2);
		
		System.out.println();
		System.out.println(num1 + " elevado ao quadrado = " +result);
		System.out.println();
		pausar.pausar();
		limparTela.limparTela();
	}
	
	public void elevaAoCubo(double num1) throws IOException {
		double result = Math.pow(num1, 3);
		
		System.out.println();
		System.out.println(num1 + " elevado ao cubo = " +result);
		System.out.println();
		pausar.pausar();
		limparTela.limparTela();
	}
	
	public void exponenciacao(double num1, double num2) throws IOException {
		double result = Math.pow(num1, num2);
		
		System.out.println();
		System.out.println(num1 + " elevado a "+num2+ " = " +result);
		System.out.println();
		pausar.pausar();
		limparTela.limparTela();
	}
	
	public void logBase10(double num1) throws IOException {
		double result = Math.log10(num1);
		
		System.out.println();
		System.out.println("Logaritmo de " +num1+ " na base 10 = " +result);
		System.out.println();
		pausar.pausar();
		limparTela.limparTela();
	}
	
	public void logNatural(double num1) throws IOException {
		double result = Math.log(num1);
		
		System.out.println();
		System.out.println("Logaritmo natural de " +num1+ " = " +result);
		System.out.println();
		pausar.pausar();
		limparTela.limparTela();
	}
	
	public void fatorial(double num1) throws IOException {
		int fat = 1;
		int aux = (int)num1;
		while (num1 > 0) {
			if (num1 == 0) {
				num1 = 1;
			}
			fat *= num1;
			num1 -= 1;
			
			
		}
		
		System.out.println();
		System.out.println(aux+"! = " +fat);
		System.out.println();
		pausar.pausar();
		limparTela.limparTela();
	}
	
	public void mediaAritmetica(int n) throws IOException {
		double numeros[] = new double[n];
		double soma = 0;
		double media = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("Digite o valor " +(i+1) +": ");
			numeros[i] = in.nextDouble();
			soma += numeros[i];
		}
		media = soma / n;
		
		System.out.println();
		System.out.println("Media aritmetica = " +media);	
		System.out.println();
		pausar.pausar();
		limparTela.limparTela();
		
		
	}
	
	public void seno(double catetoOposto, double hipotenusa) throws IOException {
		double sen = catetoOposto / hipotenusa;
		
		System.out.println();
		System.out.println("seno = " +sen + "°");
		System.out.println();
		pausar.pausar();
		limparTela.limparTela();
	}
	
	public void cosseno(double catetoAdj, double hipotenusa) throws IOException {
		double cos = catetoAdj / hipotenusa; 
		
		System.out.println();
		System.out.println("cosseno = " +cos + "°");
		System.out.println();
		pausar.pausar();
		limparTela.limparTela();
		
	}
	
	public void tangente(double catetoOposto, double catetoAdj) throws IOException {
		double tangente = catetoOposto / catetoAdj;
		
		System.out.println();
		System.out.println("tangente = " +tangente + "°");
		System.out.println();
		pausar.pausar();
		limparTela.limparTela();
	}
	
	public void equacaoSegundoGrau(double a, double b, double c) throws IOException {
		double delta = Math.pow(b, 2) - 4 * a * c;
		double x1 = 0, x2 = 0;
		
		if (delta < 0) {
			System.out.println("Nao existem raizes reais para essa equacao");
		} else {
			x1 = (-b - Math.sqrt(delta))/2*a;
			x2 = (-b + Math.sqrt(delta))/2*a;
			System.out.println("x1 = " +x1);
			System.out.println("x2 = " +x2);
		}
		
		
		pausar.pausar();
		limparTela.limparTela();
		
	}
	
	

}
