package imposto;
import teste.Orcamento;

public class ICCC implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		
		double valor = orcamento.getValor();
		if(valor < 1000.0)
			return valor * 0.07;
		else
			if(valor >= 1000.0 && valor < 3000.0)
				return valor * 0.08;
			else
				return valor * 0.08 + 30.0;
	}

}
