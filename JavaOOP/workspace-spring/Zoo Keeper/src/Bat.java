
public class Bat extends Mammal{
	
	public Bat() {
		this.energylevel += 200;
		displayEnergy();
	}

	public void fly() {
		energylevel -= 50;
		System.out.println("PHTHPHTHPHTHPHTH");
	}
	public void eatHumans() {
		energylevel += 25;
		displayEnergy();
	}
	public void attackTown() {
		energylevel -= 100;
		System.out.println("AHHHHHH!!!");
	}
	

}
