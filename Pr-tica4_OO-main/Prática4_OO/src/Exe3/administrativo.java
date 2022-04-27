package Exe3;

public class administrativo extends funcionario{

	private double horaExtra;
	
	public double salarioTotal() {
		double salario = getSalarioBase() + ( horaExtra * (this.getSalarioBase()/100));
		horaExtra=0;
		return salario;
	}
	
}
