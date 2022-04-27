package Exe3;

public class vendedores extends funcionario {
	
	private double totalValor;
	private double comissao;
	private int totalVendas;

	public void novaVenda(double valor, int qtdVenda) {
		this.totalVendas += qtdVenda;
		this.totalValor += valor;
	}

	public double salarioTotal() {
		double salario = getSalarioBase() + (totalValor * 0.05);
		totalVendas=0;
		totalValor=0;
		return salario;
	}

	}