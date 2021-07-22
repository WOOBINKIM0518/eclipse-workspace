package p494_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		try {
			
			FileInputStream fis = new FileInputStream("a.txt");
			
		}catch (FileNotFoundException e) {
			
			System.out.println(e);		//기본적인 정보를 출력			
			
			//return; 하면 여기서 끝나야하는데 아래 finally는 무조건 출력됨 
			//  e.printStackTrace() ;  //  e.printStackTrace() <== 자세한 오류정보를 출력
		}finally {
			System.out.println(" finally는 try에 상관없이 무조건 출력됨");/*에러가있던지 없던지*/
		}
		
		
		System.out.println("여기도 수행됩니다.");
	}

}
