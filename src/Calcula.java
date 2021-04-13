
public class Calcula {
	
	public void somar(double num1, double num2) {
		double result;
		
		result = num1 + num2;
		
		System.out.println(result);
	}
	
	public void subtrair(double num1, double num2) {
		double result;
		
		result = num1 - num2;
		
		System.out.println(result);
	}
	
	public void multiplicar(double num1, double num2) {
		double result;
		
		result = num1 * num2;
		
		System.out.println(result);
	}
	
	public void divisao(double num1, double num2) {
		double result;
		
		result = num1 / num2;
		
		System.out.println(result);
	}
	
	public void restoDivisao(double num1, double num2) {
		double result;
		
		result = num1 % num2;
		
		System.out.println(result);
	}
	
	public void elevaAoQuadrado(double num1) {
		double result = Math.pow(num1, 2);
		
		System.out.println(result);
	}
	
	public void elevaAoCubo(double num1) {
		double result = Math.pow(num1, 3);
		
		System.out.println(result);
	}
	
	public void exponenciacao(double num1, double num2) {
		double result = Math.pow(num1, num2);
		System.out.println(result);
	}
	
	public void logBase10(double num1) {
		double result = Math.log10(num1);
		System.out.println(result);
	}
	
	public void logNatural(double num1) {
		double result = Math.log(num1);
		System.out.println(result);
	}
	
	public void fat(int num1) {
		int fat = 1;
		while (num1 > 0) {
			fat *= num1;
			num1 -= 1;
		}
		System.out.println(fat);
	}

}
