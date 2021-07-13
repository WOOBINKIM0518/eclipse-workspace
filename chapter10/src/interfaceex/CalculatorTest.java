package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
		int num1 =10;
		int num2 = 5;
		
		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));		//»ó¼ÓµÊ(Calculator)
		System.out.println(calc.substract(num1, num2));	//»ó¼ÓµÊ(Calculator)
		System.out.println(calc.times(num1, num2));		//CompleteCalc
		System.out.println(calc.divide(num1, num2));	//CompleteCalc
		calc.showInfo();
		
	}
}
