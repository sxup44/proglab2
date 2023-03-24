package mypokemons;

import mymoves.octillery.SludgeWave;
import mymoves.remoraid.*;
import ru.ifmo.se.pokemon.*;

public class Octillery extends Pokemon {
	
	public Octillery(String name, int level) {
		super(name, level);
		
		super.setType(Type.WATER);
		super.setStats(75, 105, 75, 105, 75, 45);
		
		DoubleTeam doubleTeam = new DoubleTeam(0, 0);
		ChargeBeam chargeBeam = new ChargeBeam(50, 90);
		ThunderWave thunderWave = new ThunderWave(90, 20);
		SludgeWave sludgeWave = new SludgeWave(95, 100);
		
		super.setMove(doubleTeam, chargeBeam, thunderWave, sludgeWave);
	}
	
}

