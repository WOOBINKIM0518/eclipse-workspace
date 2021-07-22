package p465_labmda;

interface PrintString{
	void showString(String str);
}

public class TestLambda {
	public static void main(String[] args) {
		PrintString lambdaStr = s-> System.out.println(s);	//���ٽ��� ������ ����
		lambdaStr.showString("hello lamda_1");
		
		
		showMyString(lambdaStr);				//�ż��� �Ű������� ���� : showMyString()�޼��� ȣ��
		
		PrintString reStr = returnString();		//retyrnString() �޼��� ȣ��
		reStr.showString("hello");
	}
	
	public static void showMyString(PrintString p) {
		p.showString("hello lamda_2");
	}
		public static PrintString returnString() {			//��ȯ ������ ���
			return s -> System.out.println(s+"world");
		}

}
