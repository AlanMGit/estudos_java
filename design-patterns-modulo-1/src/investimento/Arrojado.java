package investimento;
import java.util.Random;

import teste.Conta;

public class Arrojado implements Investimento {
	
	private Random random;
	
	@Override
	public double calcularInvestimento(Conta conta) {
		
		int r = random.nextInt(10);
        if(r >= 0 && r <= 1) 
        	return conta.getSaldo() * 0.5;
      
        else if (r >= 2 && r <= 4) 
        	return conta.getSaldo() * 0.3;
        
        else 
        	return conta.getSaldo() * 0.006;
     
	}

}
