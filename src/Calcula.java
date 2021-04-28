import java.io.IOException;
import java.util.*;


public class Calcula {
	
	Scanner in = new Scanner(System.in);
	
	Imprimir imprimir = new Imprimir();
	
	public void somar(double num1, double num2) throws IOException {
		
		double result;			
		result = num1 + num2;
		imprimir.imprimir(result);
		
	}
	
	public void subtrair(double num1, double num2) throws IOException {
		
		double result;
		
		result = num1 - num2;
		imprimir.imprimir(result);

	}
	
	public void multiplicar(double num1, double num2) throws IOException {
		
		double result;
		
		result = num1 * num2;
		
		imprimir.imprimir(result);
	}
	
	public void divisao(double num1, double num2) {
		
		double result;
		
		result = num1 / num2;
		
		System.out.println();
		System.out.println("\n"+num1 +" / " +num2+ " = " +result+"\n");
		System.out.println();
	}
	
	public void restoDivisao(double num1, double num2) throws IOException {
		
		double result;
		
		result = num1 % num2;
		
		imprimir.imprimir(result);
	}
	
	public void elevaAoQuadrado(double num1) throws IOException {
		
		double result = Math.pow(num1, 2);
		
		imprimir.imprimir(result);
	}
	
	public void elevaAoCubo(double num1) throws IOException {
		
		double result = Math.pow(num1, 3);
		
		imprimir.imprimir(result);
	}
	
	public void exponenciacao(double num1, double num2) throws IOException {
		
		double result = Math.pow(num1, num2);
		
		imprimir.imprimir(result);
	}
	
	public void logBase10(double num1) throws IOException {
		
		double result = Math.log10(num1);
		
		imprimir.imprimir(result);
	}
	
	public void logNatural(double num1) throws IOException {
		
		double result = Math.log(num1);
		
		imprimir.imprimir(result);
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
		
		imprimir.imprimir(fat);
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
		
		imprimir.imprimir(media);
		
		
	}
	
	public void seno(double catetoOposto, double hipotenusa) throws IOException {
		
		double sen = catetoOposto / hipotenusa;
		
		imprimir.imprimir(sen);
	}
	
	public void cosseno(double catetoAdj, double hipotenusa) throws IOException {
		
		double cos = catetoAdj / hipotenusa; 
		
		imprimir.imprimir(cos);
		
	}
	
	public void tangente(double catetoOposto, double catetoAdj) throws IOException {
		
		double tangente = catetoOposto / catetoAdj;
		
		imprimir.imprimir(tangente);
	}
	

	public void equacaoPrimeiroGrau(double a, double b, double y) throws IOException {
		double x = 0;
		b = -1 * b;
		x = y + b;
		x /= a;
		
		imprimir.imprimir(x);
	}

	public void equacaoSegundoGrau(double a, double b, double c) throws IOException {
		double delta = Math.pow(b, 2) - 4 * a * c;
		double x1 = 0, x2 = 0;
		
		if (delta < 0) {
			System.out.println("Nao existem raizes reais para essa equacao");
		} else {
			x1 = (-b - Math.sqrt(delta))/2*a;
			x2 = (-b + Math.sqrt(delta))/2*a;
			imprimir.imprimir(x1, x2);
		}
		
		
		

		
	}
	
	

}
