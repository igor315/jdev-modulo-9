package principio.responsabilidade;
//Uma Classe deve conter somente responsabilidades que s�o suas.
public class ContaBancaria {
	
	private String descricao;
	
	private double saldo = 8000;
	
	public void soma100Reais() {
		saldo += 100;
	}
	
	public void subtrai100Reais() {
		saldo -= 100;
	}
	
	public void sacarDinheiro(double saque) {
		saldo -= saque;
	}
	
	public void depositoDinheiro(double deposito) {
		saldo += deposito;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return "ContaBancaria [descricao=" + descricao + ", saldo=" + saldo + "]";
	}
	
}
