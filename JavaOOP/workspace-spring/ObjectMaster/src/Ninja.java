
public class Ninja extends Human {
	public Ninja() {
		this.stealth += 7;
	}
	public void steal(Human human_to_be_stolen_from) {
		human_to_be_stolen_from.health -= this.stealth;
		human_to_be_stolen_from.displayStats();
	}
	public void runaway() {
		this.health -= 10;
		displayStats();
	}
	
}
