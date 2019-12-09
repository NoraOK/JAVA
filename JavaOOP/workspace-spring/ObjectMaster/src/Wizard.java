
public class Wizard extends Human{
	
	
	public Wizard() {
		this.health -= 50;
		this.intelligence += 5;
		
	}
	
	public void heals(Human human_to_be_healed) {
		human_to_be_healed.health += this.intelligence;
		human_to_be_healed.displayStats();
	}
	public void fireballs(Human human_to_be_fireballed) {
		human_to_be_fireballed.health -= (this.intelligence * 3);
		human_to_be_fireballed.displayStats();
	}
}
