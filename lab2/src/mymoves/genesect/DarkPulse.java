package mymoves.genesect;

import lab2.MyUtils;
import ru.ifmo.se.pokemon.*;

public class DarkPulse extends SpecialMove {

	public DarkPulse(double power, double acc) {
		super(Type.DARK, power, acc);
	}
	
	@Override
	protected void applyOppDamage(Pokemon def, double damage) {
		super.applyOppDamage(def, damage);
		
		if(MyUtils.chance(0.2)) {
			Effect.flinch(def);
		}
	}
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");	
		return "does " + pieces[pieces.length-1];
	}
	
}













