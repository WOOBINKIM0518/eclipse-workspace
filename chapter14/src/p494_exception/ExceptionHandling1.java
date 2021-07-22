package p494_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		try {
			
			FileInputStream fis = new FileInputStream("a.txt");
			
		}catch (FileNotFoundException e) {
			
			System.out.println(e);		//�⺻���� ������ ���			
			
			//return; �ϸ� ���⼭ �������ϴµ� �Ʒ� finally�� ������ ��µ� 
			//  e.printStackTrace() ;  //  e.printStackTrace() <== �ڼ��� ���������� ���
		}finally {
			System.out.println(" finally�� try�� ������� ������ ��µ�");/*�������ִ��� ������*/
		}
		
		
		System.out.println("���⵵ ����˴ϴ�.");
	}

}
