package woobin;

public class Test_14 {

	public static void main(String[] args) {
		int intArray[] = new int[10];
		int sum =0;
		
		for(int i =0 ; i < intArray.length; i++) {
			intArray[i] =  (int)(Math.random()*10+1);
			System.out.println(intArray[i]);
		sum += intArray[i];
		}
		double numAverage = sum/intArray.length;
		System.out.println("������ ���� 10���� ����� : " + numAverage);
	}

}
