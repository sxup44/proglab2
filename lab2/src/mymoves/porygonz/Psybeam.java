package mymoves.porygonz;

import lab2.MyUtils;
import ru.ifmo.se.pokemon.*;

public class Psybeam extends SpecialMove{
	
	public Psybeam(double power, double acc) {
		super(Type.PSYCHIC, power, acc);
	}

	@Override
	protected void applyOppDamage(Pokemon def, double damage) {
		super.applyOppDamage(def, damage);
		
		if(MyUtils.chance(0.1)) {
			Effect.confuse(def);
			System.out.println("// " + def + " is confused //");
		}
	}
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");	
		return "does " + pieces[pieces.length-1];
	}
	
}


