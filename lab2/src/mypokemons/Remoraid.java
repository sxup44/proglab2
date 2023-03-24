package mypokemons;

import mymoves.remoraid.*;
import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.Type;

public class Remoraid extends Pokemon {
	
	public Remoraid(String name, int level) {
		super(name, level);
		
		super.setType(Type.WATER);
		super.setStats(35, 65, 35, 65, 35, 65);
		
		DoubleTeam doubleTeam = new DoubleTeam(0, 0);
		ChargeBeam chargeBeam = new ChargeBeam(50, 90);
		ThunderWave thunderWave = new ThunderWave(90, 20);
		
		super.setMove(doubleTeam, chargeBeam, thunderWave);
	}
	
}










