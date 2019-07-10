
public class Conta {
	double saldo;
	int numero;
	int agencia;
	String titular;
	
	public void deposita (double valor) {
		this.saldo += valor;
	}
	
	public void saca (double valor) {
		this.saldo -= valor;
	}
}
