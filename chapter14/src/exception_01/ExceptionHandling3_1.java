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
				
				if (fis !=null) {	//null�� �ƴϸ� �Ʒ� ���� �۵�
				try {
					fis.close();
				} catch (IOException e) {
					System.out.println(e);
				}		//FileInputStream��	����ϸ�	�ݵ�� ���� �ؾ��Ѵ�. <close()>
									//fis.close();�� Exceptionó���� �ؾ� �Ѵ�.
			
				}
			
				System.out.println("�׻� ���� �˴ϴ�.");
			}
		}
}