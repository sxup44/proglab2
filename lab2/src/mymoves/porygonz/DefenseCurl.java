package mymoves.porygonz;

import ru.ifmo.se.pokemon.*;

public class DefenseCurl extends StatusMove {
	
	public DefenseCurl(double power, double acc) {
		super(Type.NORMAL, power, acc);
	}

	@Override
	protected void applySelfEffects(Pokemon p) {
		super.applySelfEffects(p);
	
		Effect e = new Effect().stat(Stat.DEFENSE, 1);
	}

	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");	
		return "does " + pieces[pieces.length-1];
	}

}



