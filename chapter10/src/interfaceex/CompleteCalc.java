package interfaceex;

public class CompleteCalc extends Calculator{

	@Override
	public int times(int num1, int num2) {
		return num1 * num2 ;
	}

	@Override
	public int divide(int num1, int num2) {		
		if (num2 !=0 ) 				//num1/0으로 나눌경우 프로그램에서는 계산 불능
			return num1/num2;
		else 	
		return Calc.ERROR;

}
}