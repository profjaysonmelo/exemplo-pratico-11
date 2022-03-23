
public class ContaPoupanca extends Conta{

	private int diaAniversario;

	public ContaPoupanca(String numero, int diaAniversario) {
		super(numero);
		this.diaAniversario = diaAniversario;
	}
	
	public ContaPoupanca(){
	}

	public int getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}

	public void atualizarPorTaxa(double taxa){
		this.setSaldo(this.getSaldo() + (this.getSaldo() * 3 * taxa / 100));
	}
}
