package p496_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling5 {

	public static void main(String[] args) {
		
		//try with resource �� : 
		//try (resource), resource �� ��ü�� AutoCloseable �������̽��� �����Ǿ���Ѵ�.
		
		
		try (FileInputStream fis = new FileInputStream("a.txt");){
			//try with resource �� :  try (resource)
			}catch (IOException e) {
				System.out.println(e);
				return;
			}
			System.out.println("���⵵ ���� �˴ϴ�.");
	}
}
