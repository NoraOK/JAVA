
public class Samurai extends Human{
	static int count= 0;
	
	public Samurai() {
		this.health += 100;
		count++;
	}
	public void deathBlow(Human human_to_be_deathblown) {
		human_to_be_deathblown.health = 0;
		this.health =(this.health/2);
		human_to_be_deathblown.displayStats();
		this.displayStats();
	}
	public void meditate() {
		this.health = th;
	}
	public static void howMany() {
		System.out.println(count);
	}

	
}
