
public class Pythagorean{
    public String calculateHypotenuse(int legA, int legB){
        double hypotenuse = Math.sqrt(Math.pow(legA, 2) + Math.pow(legB,2));
        return "The hypotenuse is: " +hypotenuse;
    }
}