package interfaceex;

public class CompleteCalc extends Calculator{

	

	@Override
	public int times(int num1, int num2) {
		return num1 * num2 ;
	}

	@Override
	public int divide(int num1, int num2) {		
		if (num2 !=0 ) 				//num1/0���� ������� ���α׷������� ��� �Ҵ�
			return num1/num2;
		else 	
		return Calc.ERROR;
		

}
	
/*
 * @Override public void desecription() {
 * System.out.println(" Calc �������̽����� ���ǵ� defautl �޼ҵ嵵 ������(�������̵�)�� �����մϴ�"); }
 */
}