package mymoves.octillery;

import lab2.MyUtils;
import ru.ifmo.se.pokemon.*;

public class SludgeWave extends SpecialMove {
	
	public SludgeWave(double power, double acc) {
		super(Type.POISON, power, acc);
	}

	@Override
	protected void applyOppEffects(Pokemon p) {
		super.applyOppEffects(p);
		
		if(MyUtils.chance(0.1)) {
			Effect.poison(p);
			System.out.println("// " + p + " is poisoned //");
		}	
	}
		
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");	
		return "does " + pieces[pieces.length-1];
	}
	
}







