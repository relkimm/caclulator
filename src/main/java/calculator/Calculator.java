package calculator;

public class Calculator {
	
	public int add(int i, int j) {
		return i + j;
	}
	
	public int substract(int i, int j) {
		return i - j;
	}
	
	public int multiply(int i, int j) {
		return  i * j;
	}
	
	public int divide(int i, int j) {
		return i / j;
	}
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.add(3, 4));
		System.out.println(cal.substract(5, 2));
		System.out.println(cal.multiply(3, 2));
		System.out.println(cal.divide(6, 2));
		
	}
}
