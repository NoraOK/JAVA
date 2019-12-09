
public class CalculatorTest {
    public static void main(String[] args){
		Calculator nora = new Calculator();
		nora.setOperandOne(10.5);
		nora.setOperandTwo(9.5);
		nora.setOperation("hjgj");
		nora.performOperation();
		System.out.println(nora.getResults());
    }
	
}
