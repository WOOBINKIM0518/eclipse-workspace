package array;

public class ArrayTest2 {

	public static void main(String[] args) {
		double[] data = new double[5];  // 방5개 배열을 생성 선언!
	  //double data[] = new double[5]; 위식과 동일한 식

		
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		for (int i = 0; i<data.length;i++) {
			System.out.println(data[i]);
		}
		
		
		int[] data2 = new int[] {1,2,3,4,5}; // 배열선언과 동시에 값 할당
		
		
		for (int i =0 ; i<data2.length;i++){
			
		}
		
	}
}
