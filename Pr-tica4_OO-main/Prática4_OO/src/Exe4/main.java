package Exe4;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		popular[] carros = new popular[100];
		int cont = 0;
		do{
		
			String  op = JOptionPane.showInputDialog("(1) Cadastro Carro Popular \n(2) Calcular Preço \n(3) Sair");
			
			switch (op) {
				case "1":
					
					int PB = Integer.parseInt( JOptionPane.showInputDialog("Preço base? "));
					boolean ABS = Boolean.parseBoolean( JOptionPane.showInputDialog("Abs? \n Sim (1) \n Não (0)"));
					boolean AB = Boolean.parseBoolean( JOptionPane.showInputDialog("Airbag? \n Sim (1) \n Não (0)"));
					boolean AL = Boolean.parseBoolean( JOptionPane.showInputDialog("Alarme? \n Sim (1) \n Não (0)"));
					boolean SOM = Boolean.parseBoolean( JOptionPane.showInputDialog("Som? \n Sim (1) \n Não (0)"));
					boolean CE = Boolean.parseBoolean( JOptionPane.showInputDialog("Conjunto Eletrico? \n Sim (1) \n Não (0)"));
					boolean CB = Boolean.parseBoolean( JOptionPane.showInputDialog("Computador Bordo? \n Sim (1) \n Não (0)"));
					
					carros[cont] = new popular(PB, ABS, AB, AL, SOM, CE, CB);
					
					cont++;
					break;
				case "2":
					
					JOptionPane.showMessageDialog(null, "Preço final: "+ carros[cont - 1].calcularPrecoFinalPopular());
					
					break;
				case "3":
					JOptionPane.showMessageDialog(null, "Programa finalizado!");
					cont = 1000;
					break;
				default:
					JOptionPane.showMessageDialog(null, "Resposta Invalída");
			}
			
			
		}while(cont != 1000);
	}

}