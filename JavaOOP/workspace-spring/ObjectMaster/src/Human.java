
public class Human {
	protected int strength = 3;
	protected int intelligence = 3;
	protected int stealth = 3;
	protected int health = 100;
	
	
	public void attack(Human human_being_attacked) {
		human_being_attacked.health -= this.strength;
		
	}
	public int getHealth() {
		return health;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public int getStealth() {
		return stealth;
	}
	public int getStrength() {
		return strength;
	}
	
	public void displayStats() {
		System.out.println("Health: "+this.health+", Intell: "+this.intelligence+", Strength: "+this.strength+" ,Stealth: "+this.stealth);
	}
	 
}
