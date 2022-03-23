
public class Conta {

	private String numero;
	private double saldo;
	
	public Conta(String numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public Conta(String numero) {
		this.numero = numero;
	}
	
	public Conta(){
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void sacar(double valor){
		this.saldo = this.saldo - valor;
	}
	
	public void sacar(int valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void sacar(float valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void depositar(double valor){
		this.saldo = this.saldo + valor;
	}
	
	public void depositar(int valor){
		this.saldo = this.saldo + valor;
	}
	
	public void depositar(float valor){
		this.saldo = this.saldo + valor;
	}
	
	public void atualizarPorTaxa(double taxa){
		this.saldo = this.saldo + (this.saldo * taxa / 100);
	}
}
