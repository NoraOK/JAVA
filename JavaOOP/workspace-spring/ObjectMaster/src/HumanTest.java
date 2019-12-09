
public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Wizard nora = new Wizard();
	    Samurai lauren = new Samurai();
	    Ninja lindsey = new Ninja();
	    
	    nora.heals(lindsey);
	    nora.fireballs(lauren);
	    lindsey.steal(nora);
	    lindsey.runaway();
	    Samurai chris = new Samurai();
	    Samurai.howMany();
	    chris.deathBlow(nora);
	}

}
