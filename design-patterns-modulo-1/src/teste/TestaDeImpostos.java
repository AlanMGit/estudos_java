package teste;
import imposto.Conservador;
import imposto.ICCC;
import imposto.ICMS;
import imposto.ISS;
import imposto.Imposto;

public class TestaDeImpostos {
	
	public static void main(String[] args) {
		
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		
		Orcamento orcamento = new Orcamento(500.0);
		
		CalculadorImposto calculador = new CalculadorImposto();
		calculador.realizaCalculo(orcamento, iss);
		calculador.realizaCalculo(orcamento, icms);
		calculador.realizaCalculo(orcamento, new ICCC());
		
		Conta conta = new Conta();
		conta.deposita(100.0);
		RealizadorDeInvestimentos realizadorDeInvestimentos = new RealizadorDeInvestimentos();
		realizadorDeInvestimentos.realiza(conta, new Conservador());
		
	}
}
