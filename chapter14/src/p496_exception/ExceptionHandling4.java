package p496_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling4 {

	public static void main(String[] args) {
		
		//FileInputStream fis = null;
		
		try(FileInputStream fis = new FileInputStream("a.txt");){
			//fis = new FileInputStream("a.txt");
			}catch (IOException e) {
				System.out.println(e);
				return;
			}/*finally {
				if(fis != null){
				try {
					fis.close();
				}catch(IOException e) {
					//TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				System.out.println("항상 수행 됩니다.");
			}*/ 
	}
}
