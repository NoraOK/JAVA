
public class Gorilla extends Mammal{
	public Gorilla() {
		
	}
	public void throwSomething() {
		energylevel -= 5;
		System.out.println("WATCH OUT! The gorilla threw something!");
	}
	public void eatBananas() {
		energylevel += 10;
		System.out.println("YUMMMMMMMMM");
	}
	public void climb() {
		energylevel += 10;
		System.out.println("It's a bird, it's a plane, its a gorilla!!!");
	}
}
