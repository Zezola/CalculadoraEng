import java.io.IOException;

public class Imprimir {
	
	
	public void imprimir(double result) throws IOException {
		Pausar pausar = new Pausar();
		LimparTela limparTela = new LimparTela();
		System.out.println();
		System.out.println(result);
		System.out.println();
		pausar.pausar();
		limparTela.limparTela();
	}
	
	
	public void imprimir(double x1, double x2) throws IOException {
		Pausar pausar = new Pausar();
		LimparTela limparTela = new LimparTela();
		System.out.println();
		System.out.println(x1);
		System.out.println(x2);
		System.out.println();
		pausar.pausar();
		limparTela.limparTela();
	}
	
	
	
}
