package exception_01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception_01 {

		public static void main(String[] args) throws FileNotFoundException {
			
			FileInputStream fis = null;
	
	FileInputStream fis1 = null;
	
	try {
		fis1 = new FileInputStream("a.txt");
		
	}	catch(FileNotFoundException e) {
		System.out.println(e);
		return;		//return을 만나면 프로그램 종료 , finally는 try에서는 출력
		
	}finally{//try 문이 있으면 무조건 작동
			System.out.println("항상 수행 됩니다.");
	}
		System.out.println("여기도 수행 됩니다.");
}
}




