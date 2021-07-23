package exception_01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling3_1 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try{
			
			fis = new FileInputStream("a.txt");
			
			}catch (FileNotFoundException e) {
				System.out.println(e);
				return;
				
			}finally {
				
				if (fis !=null) {	//null이 아니면 아래 구문 작동
				try {
					fis.close();
				} catch (IOException e) {
					System.out.println(e);
				}		//FileInputStream을	사용하면	반드시 종료 해야한다. <close()>
									//fis.close();도 Exception처리를 해야 한다.
			
				}
			
				System.out.println("항상 수행 됩니다.");
			}
		}
}