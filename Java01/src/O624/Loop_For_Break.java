package O624;

public class Loop_For_Break {

	public static void main(String[] args) {

		int sum = 0;
		int num = 0;
		
		for ( num=0; ;num++) { 
			// �߰��� ������ ������ ��� ��ȯ ���� �Ʒ� if �Լ� �־��ְ� break;
			
			sum += num;  // sum = sum+num
			
			
			if(sum>=100)
				break;
		}
		
		System.out.println("1���� ���� 100�� �Ѿ �� ���� : "+num);
		System.out.println("100�� �Ѿ �� �� ���� : " +sum);
		
	}

}
