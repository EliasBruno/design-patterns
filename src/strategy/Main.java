package strategy;

import strategy.operacoes.Somar;
import strategy.operacoes.Subtrair;

public class Main {
	
	public static void main(String[] args) {
		ContextMath math = new ContextMath(new Somar());
		System.out.println(math.calcular(3, 6));
		
		math = new ContextMath(new Subtrair());
		System.out.println(math.calcular(3, 6));
		
	}
}
