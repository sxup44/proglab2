package mypokemons;

import mymoves.porygonz.*;
import ru.ifmo.se.pokemon.*;

public class Porygon2 extends Pokemon{
	
	public Porygon2(String name, int level) {
		super(name, level);
		
		super.setType(Type.NORMAL);
		super.setStats(85, 80, 90, 105, 95, 60);
		
		IceBeam iceBeam = new IceBeam(90, 100);
		Facade facade = new Facade(70, 100);
		DefenseCurl defenseCurl = new DefenseCurl(0, 0);
		
		super.setMove(iceBeam, facade, defenseCurl);	
	}
}










