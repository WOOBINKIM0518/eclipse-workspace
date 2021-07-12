package array;

public class DachawonArray_Test2 {
	public static void main(String[] args) {
		
		int[][] arr = new int[4][5];
		
		for (int i = 0; i < arr.length; i++) 
			for (int j = 0 ; j < arr[i].length; j++)
				arr[0][j] = 1 +j;
			
			
		for (int i = 0; i < arr.length; i++)
			for (int j = 0 ; j < arr[i].length; j++)
		
					System.out.print(arr[i][j]+" ");
		}
	
	}