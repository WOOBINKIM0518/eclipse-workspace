package exam;

public class Test7 {

	public static void main(String[] args) {
		int sum =0;
		int arr[] = new int[10];
		
		
		System.out.println("1~10������ ������ ���� 10��");
		System.out.println();
		
		for(int i =0 ; i <arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
			
			sum += arr[i];
			System.out.print(arr[i]+ " ");
		}System.out.println();
		System.out.println("������ ���� 10���� ����� : "+ (double)sum/arr.length);
	}

}
