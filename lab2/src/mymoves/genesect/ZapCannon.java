package mymoves.genesect;

import lab2.MyUtils;
import ru.ifmo.se.pokemon.*;

public class ZapCannon extends SpecialMove{
	
	public ZapCannon(double power, double acc) {
		super(Type.ELECTRIC, power, acc);
	}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		super.applyOppEffects(p);
		
		if(MyUtils.chance(0.375)) {
			Effect.paralyze(p);
			System.out.println("// " + p + " paralyzed //");
		}
	}

	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");	
		return "does " + pieces[pieces.length-1];
	}
	
}








