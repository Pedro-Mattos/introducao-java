
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaPaulo = new Conta();
		contaPaulo.saldo = 100;
		contaPaulo.deposita(200);
		
		System.out.println("A conta do paulo depositou " + contaPaulo.saldo);
		
		contaPaulo.saca(100);
		System.out.println("O saldo agora � de " + contaPaulo.saldo);
	}
}
