package mypokemons;

import mymoves.genesect.*;
import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.Type;

public class Genesect extends Pokemon {
	
	public Genesect(String name, int level) {
		super(name, level);
		
		super.setType(Type.BUG, Type.STEEL);
		super.setStats(71, 120, 95, 120, 95, 99);
		
		FlashCannon flashCannon = new FlashCannon(80, 100);
		DarkPulse darkPulse = new DarkPulse(80, 100);
		Thunderbolt thunderbolt = new Thunderbolt(90, 100);
		ZapCannon zapCannon = new ZapCannon(120, 50);
		
		super.setMove(flashCannon, darkPulse, thunderbolt, zapCannon);
	}

}





