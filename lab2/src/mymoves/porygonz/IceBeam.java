package mymoves.porygonz;

import lab2.MyUtils;
import ru.ifmo.se.pokemon.*;

public class IceBeam extends SpecialMove{
	
	public IceBeam(double power, double acc) {
		super(Type.ICE, power, acc);
	}

	@Override
	protected void applyOppDamage(Pokemon def, double damage) {
		super.applyOppDamage(def, damage);
		
		if(MyUtils.chance(0.1)) {
			Effect.freeze(def);
			System.out.println("// " + def + " is frozen //");
		}
	}
	
	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");	
		return "does " + pieces[pieces.length-1];
	}
	
}




