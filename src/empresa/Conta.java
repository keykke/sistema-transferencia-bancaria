package empresa;

public class Conta {
	public String nome;
	public double saldo;
		
	public Conta(String nome, double saldo) {
		this.nome = nome;
		this.saldo = saldo;
	}

	boolean sacar(double valor) throws Exception {
		if (valor <= 0) throw new Exception("Valor negativo.");
		if (valor > saldo) throw new Exception("Saldo insuficiente.");
		
		saldo -= valor;
		return true;
	}
	
	boolean depositar(double valor) throws Exception {
		if (valor <= 0) throw new Exception("Valor negativo.");
		
		saldo += valor;
		return true;
	}

	void info() {
		System.out.println("Nome: " + nome + " | Saldo: R$ " + saldo);
	}
	
	void transferir(double valor, Conta destino) throws Exception {
		this.sacar(valor);
		destino.depositar(valor);
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + ", Saldo: R$ " + saldo;
	}
}