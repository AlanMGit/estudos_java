package teste;
import imposto.Imposto;

public class CalculadorImposto {
	
	public void realizaCalculo(Orcamento orcamento, Imposto imposto){
		double icms = imposto.calcula(orcamento);
		System.out.println(icms);
	}
}
