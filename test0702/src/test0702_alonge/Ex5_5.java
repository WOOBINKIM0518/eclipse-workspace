package test0702_alonge;

public class Ex5_5 {
	public static void main(String[] args) {
	int Arr[][] = new int[4][];  //���� ������ ���� ���� �տ� �ְ�
	Arr[0] = new int[3]; // �� �ึ�� ���� �� �����ϱ�
	Arr[1] = new int[2];
	Arr[2] = new int[3];
	Arr[3] = new int[2];
	
	for (int i = 0 ; i < Arr.length; i++) {
		for (int j = 0 ; j < Arr[i].length; j++)
			Arr[i][j] = (i+1)*10+j;}
	
	
		for (int i = 0 ; i < Arr.length; i++) {
			for (int j = 0 ; j < Arr[i].length; j++)
			System.out.print(Arr[i][j]+ " ");
			System.out.println();}
		
			
	
	
}
}
