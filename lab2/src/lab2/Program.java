package lab2;

import mypokemons.*;
import ru.ifmo.se.pokemon.*;

public class Program {
	
	// https://pokemondb.net/pokedex/genesect
	// https://pokemondb.net/pokedex/remoraid
	// https://pokemondb.net/pokedex/octillery
	// https://pokemondb.net/pokedex/porygon
	// https://pokemondb.net/pokedex/porygon2
	// https://pokemondb.net/pokedex/porygon-z
	
	public static void main(String[] args) {

		Battle b = new Battle();
		
		Genesect genesect = new Genesect("Dark", 4);
		Remoraid remoraid = new Remoraid("Ketchup", 4);
		Octillery octillery = new Octillery("Packy", 4);
		Porygon porygon = new Porygon("Stone", 4);
		Porygon2 porygon2 = new Porygon2("Rock", 4);
		PorygonZ porygonz = new PorygonZ("Diamond", 4);
		
		b.addAlly(genesect);
		b.addAlly(remoraid);
		b.addAlly(octillery);
		
		b.addFoe(porygon);
		b.addFoe(porygon2);
		b.addFoe(porygonz);
		
		b.go();
		
	}
	
}


