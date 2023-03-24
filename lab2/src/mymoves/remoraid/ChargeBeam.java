package mymoves.remoraid;

import lab2.MyUtils;
import ru.ifmo.se.pokemon.*;

public class ChargeBeam extends SpecialMove{
	
	public ChargeBeam(double power, double acc) {
		super(Type.ELECTRIC, power, acc);
	}

	@Override
	protected void applySelfEffects(Pokemon p) {
		super.applySelfEffects(p);
	
		if(MyUtils.chance(0.7)) {
			Effect e = new Effect().stat(Stat.ATTACK, 1);
		}
		
	}

	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");	
		return "does " + pieces[pieces.length-1];
	}

}











