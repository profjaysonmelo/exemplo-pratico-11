
public class ContaCorrente extends Conta{

	private double limite;
	private static final int MULTIPLICADOR_TAXA = 2;
	private static final double TAXA_DEPOSITO = 0.10;

	public ContaCorrente() {
	}

	public ContaCorrente(String numero) {
		super(numero);
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void depositar(double valor){
		this.setSaldo(this.getSaldo() + valor - TAXA_DEPOSITO);
	}
	
	public void atualizarPorTaxa(double taxa){
		this.setSaldo(this.getSaldo() + (this.getSaldo() * MULTIPLICADOR_TAXA * taxa / 100));
	}
}
