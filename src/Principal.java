import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
//		Conta c1 = new ContaCorrente();
//		c1.setSaldo(1000);
//		c1.atualizarPorTaxa(5);
//		c1.sacar(350);
//		c1.depositar(1450);
//		
//		System.out.println("Conta 1: " + c1.getSaldo());
//		
//		Conta c2 = new ContaPoupanca();
//		c2.setSaldo(1000);
//		c2.atualizarPorTaxa(5);
//		c2.sacar(500);
//		c2.depositar(2100);
//		
//		System.out.println("Conta 2: " + c2.getSaldo());
		
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("1-CC/2-CP"));
		Conta c1;
		if (opcao == 1){
			c1 = new ContaCorrente();
		} else {
			c1 = new ContaPoupanca();
		}
		c1.setSaldo(Integer.parseInt(JOptionPane.showInputDialog("Saldo Inicial")));
		c1.atualizarPorTaxa(Integer.parseInt(JOptionPane.showInputDialog("Valor da Taxa de Atualização da conta")));
		c1.sacar(Double.parseDouble(JOptionPane.showInputDialog("Valor do Saque")));
		c1.depositar(Double.parseDouble(JOptionPane.showInputDialog("Valor do Depósito")));
		
		JOptionPane.showMessageDialog(null, "Conta 1: " + c1.getSaldo());
	}
}
