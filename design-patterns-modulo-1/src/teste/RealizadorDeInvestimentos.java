package teste;
import investimento.Investimento;

public class RealizadorDeInvestimentos {
	
	public void realiza(Conta conta, Investimento investimento) {
        double resultado = investimento.calcularInvestimento(conta);

        conta.deposita( resultado );
        System.out.println ( "Novo saldo: " + conta.getSaldo());
      }
	
}
