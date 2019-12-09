
public class Calculator {
	private double num1;
	private double num2;
	private String operation;
	private double result;
	
	

	public void setOperandOne(double num1) {
		this.num1 = num1;
	}
	public void setOperandTwo(double num2) {
		this.num2 = num2;
	}
	
	public void setOperation(String operation) {
		this.operation =operation;
	}
	
	
	public void performOperation() {
		if(this.operation == "+") {
			result = this.num1 + this.num2;
		}else if(this.operation == "-") {
			result = this.num1 - this.num2;
		}else {
			System.out.println("Operation not valid");
		}
	}
	
	public String getResults() {
		return(this.num1+" "+" "+this.operation+" "+this.num2+" = "+this.result);
	}
}
