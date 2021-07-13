package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
		int num1 =10;
		int num2 = 5;
		
		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));		//상속됨(Calculator)
		System.out.println(calc.substract(num1, num2));	//상속됨(Calculator)
		System.out.println(calc.times(num1, num2));		//CompleteCalc
		System.out.println(calc.divide(num1, num2));	//CompleteCalc
		calc.showInfo();
		
		calc.desecription();	//Calc 클래스의 메소드, 상속 되어서 내려감
		
		int[] arr = { 1,2,3,4,5};
		
		System.out.println(Calc.total(arr));	//Calc는 클래스명
	}											// Calc클래스의 statci 메소드t
}
