package exam;

public class Test4 {

	public static void main(String[] args) {
		
		int arr[] = {4,5,1,2,3};
		int max = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		System.out.println("�迭�Ǽ� �ִ밪�� : "+ max + "  �Դϴ�.");
		
	}

}