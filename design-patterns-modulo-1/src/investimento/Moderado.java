package investimento;

import java.util.Random;
import teste.Conta;

public class Moderado implements Investimento {
	
	private Random r;

    public Moderado() {
      this.r = new Random();
    }
    
	@Override
	public double calcularInvestimento(Conta conta) {
		
		if(r.nextInt(2) == 0) 
			return conta.getSaldo() * 0.025;
		
        else 
        	return conta.getSaldo() * 0.007;
	}
	
}
