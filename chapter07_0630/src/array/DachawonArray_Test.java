package array;

public class DachawonArray_Test {
	public static void main(String[] args) {
		
		long total =1L;
		int[][] arr = {{1,2,3,4,5,},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
		

		
		for (int i = 0; i < arr.length; i++) { // ��
			for(int j =0; j< arr[i].length;j++) { // ��
				System.out.print(arr[i][j]+ "  ");
				
			 total *= arr[i][j];
			}
			
			System.out.println();
		
		}
		System.out.println("total �� ���� : "+ total);		
	}
}
				
			
	
