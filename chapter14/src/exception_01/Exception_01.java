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
		return;		//return�� ������ ���α׷� ���� , finally�� try������ ���
		
	}finally{//try ���� ������ ������ �۵�
			System.out.println("�׻� ���� �˴ϴ�.");
	}
		System.out.println("���⵵ ���� �˴ϴ�.");
}
}




