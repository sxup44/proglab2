package mypokemons;

import mymoves.porygonz.*;
import ru.ifmo.se.pokemon.*;

public class Porygon extends Pokemon{
	
	public Porygon(String name, int level) {
		super(name, level);
		
		super.setType(Type.NORMAL);
		super.setStats(65, 60, 70, 85, 75, 40);
		
		IceBeam iceBeam = new IceBeam(90, 100);
		Facade facade = new Facade(70, 100);

		super.setMove(iceBeam, facade);
	}
}










