import java.io.IOException;

public class LimparTela {
	public void limparTela() throws IOException {
		
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
}
