package chapter04_���ǹ�;

public class Loop_For_Example01 {

	public static void main(String[] args) {
		
		int i;
		int sum;
		for (i=0,sum=0; i <10 ; i++) { // i=0 ���� ���� why ? �迭���� 0���� ����
			sum += (i+1);  // sum = sum + (i+1)
		
			System.out.println(sum);
			
		
		}
		
		System.out.println("1���� 10������ ���� " + sum + " �Դϴ�.");
		
	}
}
