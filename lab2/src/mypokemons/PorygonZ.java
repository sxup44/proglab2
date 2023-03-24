package mypokemons;

import mymoves.porygonz.*;
import ru.ifmo.se.pokemon.*;

public class PorygonZ extends Pokemon{
	
	public PorygonZ(String name, int level) {
		super(name, level);
		
		super.setType(Type.NORMAL);
		super.setStats(85, 80, 70, 135, 75, 90);

		IceBeam iceBeam = new IceBeam(90, 100);
		Facade facade = new Facade(70, 100);
		DefenseCurl defenseCurl = new DefenseCurl(0, 0);
		Psybeam psybeam = new Psybeam(65, 100);
		
		super.setMove(iceBeam, facade, defenseCurl, psybeam);
	}
}





