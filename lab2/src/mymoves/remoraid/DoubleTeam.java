package mymoves.remoraid;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
	
	public DoubleTeam(double power, double acc) {
		super(Type.NORMAL, power, acc);
	}

	@Override
	protected void applySelfEffects(Pokemon p) {
		super.applySelfEffects(p);
	
		Effect e = new Effect().stat(Stat.EVASION, 1);
	}

	@Override
	protected String describe() {
		String[] pieces = this.getClass().toString().split("\\.");	
		return "does " + pieces[pieces.length-1];
	}

}





