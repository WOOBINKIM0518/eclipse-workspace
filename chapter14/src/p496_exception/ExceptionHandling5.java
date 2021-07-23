package p496_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling5 {

	public static void main(String[] args) {
		
		//try with resource 문 : 
		//try (resource), resource 의 객체는 AutoCloseable 인터페이스가 구현되어야한다.
		
		
		try (FileInputStream fis = new FileInputStream("a.txt");){
			//try with resource 문 :  try (resource)
			}catch (IOException e) {
				System.out.println(e);
				return;
			}
			System.out.println("여기도 수행 됩니다.");
	}
}
