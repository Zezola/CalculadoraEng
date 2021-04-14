import java.util.*;


public class Calcula {
	
	Scanner in = new Scanner(System.in);
	
	public void somar(double num1, double num2) {
		double result;
		
		result = num1 + num2;
		System.out.println();
		System.out.println(result);
		System.out.println();
	}
	
	public void subtrair(double num1, double num2) {
		double result;
		
		result = num1 - num2;
		System.out.println();
		System.out.println(result);
		System.out.println();
	}
	
	public void multiplicar(double num1, double num2) {
		double result;
		
		result = num1 * num2;
		
		System.out.println();
		System.out.println(result);
		System.out.println();
	}
	
	public void divisao(double num1, double num2) {
		double result;
		
		result = num1 / num2;
		
		System.out.println();
		System.out.println(result);
		System.out.println();
	}
	
	public void restoDivisao(double num1, double num2) {
		double result;
		
		result = num1 % num2;
		
		System.out.println();
		System.out.println(result);
		System.out.println();
	}
	
	public void elevaAoQuadrado(double num1) {
		double result = Math.pow(num1, 2);
		
		System.out.println();
		System.out.println(result);
		System.out.println();
	}
	
	public void elevaAoCubo(double num1) {
		double result = Math.pow(num1, 3);
		
		System.out.println();
		System.out.println(result);
		System.out.println();
	}
	
	public void exponenciacao(double num1, double num2) {
		double result = Math.pow(num1, num2);
		
		System.out.println();
		System.out.println(result);
		System.out.println();
	}
	
	public void logBase10(double num1) {
		double result = Math.log10(num1);
		
		System.out.println();
		System.out.println(result);
		System.out.println();
	}
	
	public void logNatural(double num1) {
		double result = Math.log(num1);
		
		System.out.println();
		System.out.println(result);
		System.out.println();
	}
	
	public void fatorial(int num1) {
		int fat = 1;
		while (num1 > 0) {
			fat *= num1;
			num1 -= 1;
		}
		
		System.out.println();
		System.out.println(fat);
		System.out.println();
	}
	
	public void mediaAritmetica(int n) {
		double numeros[] = new double[n];
		double soma = 0;
		double media = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("Digite o valor " +(i+1));
			numeros[i] = in.nextDouble();
			soma += numeros[i];
		}
		media = soma / n;
		
		System.out.println();
		System.out.println(media);	
		System.out.println();
		
		
	}
	
	public void seno(double catetoOposto, double hipotenusa) {
		// sen(x) = cat.op / hip 
		double sen = catetoOposto / hipotenusa;
		
		System.out.println();
		System.out.println(sen + "°");
		System.out.println();
	}
	
	public void cosseno(double catetoAdj, double hipotenusa) {
		double cos = catetoAdj / hipotenusa; 
		
		System.out.println();
		System.out.println(cos + "°");
		System.out.println();
		
	}
	
	public void tangente(double catetoOposto, double catetoAdj) {
		double tangente = catetoOposto / catetoAdj;
		
		System.out.println();
		System.out.println(tangente + "°");
		System.out.println();
	}
	
	

}
