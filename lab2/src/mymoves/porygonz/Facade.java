package mymoves.porygonz;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove{
	
	public Facade(double power, double acc) {
		super(Type.NORMAL, power, acc);
	}
    
	private boolean flag;
    @Override
    public void applyOppDamage(Pokemon def, double damage){
        Status cond = def.getCondition();
        flag = true;
        if (cond.equals(Status.POISON) || cond.equals(Status.BURN) || cond.equals(Status.PARALYZE)) {
            def.setMod(Stat.HP, -2*(int)Math.round(damage));
        }
    }
    @Override
    protected String describe(){
        if(flag) return "hits hard";
        else return "hits";
    }
}














