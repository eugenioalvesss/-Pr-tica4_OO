package Exe2;

public class Main {

	public static void main(String[] args) {
	
	ContaCorrente cc = new ContaCorrente();
	cc.depositar(1220.20);
	cc.sacar(300);
	
	ContaPoupanca cp = new ContaPoupanca();
	cp.depositar(55.50);
	cp.sacar(22);
	
	GeradorExtratos gerador = new GeradorExtratos();
	gerador.geradorConta(cc);
	gerador.geradorConta(cp);

	}

}
