package imposto;
import investimento.Investimento;
import teste.Conta;

public class Conservador implements Investimento {

	@Override
	public double calcularInvestimento(Conta conta) {
		return conta.getSaldo() * 0.08;
	}

}
