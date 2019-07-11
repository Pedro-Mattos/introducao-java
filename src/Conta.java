
public class Conta {
	double saldo;
	int numero;
	int agencia;
	String titular;
	String cpf;
	String profissao;
	
	public void deposita (double valor) {
		this.saldo += valor;
	}
	
	public boolean saca (double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
		
	}
}
