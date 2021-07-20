package p450_innerclassw;

class OutClass{
	private int num = 10;			//�ν��Ͻ� ����, new �ν��Ͻ� �����Ŀ��� ���
	private static int sNum = 20;	//���� ����, new �ν��Ͻ� �������� Ŭ�����̸����λ��.
	private InClass inClass;
	//InClass inClass;  // InClass�� ��ü�� ������ ����, OuterClass�� ������ ��
						// InClass�� ��ü����
	
	public OutClass() {
		inClass = new InClass();	//���� Ŭ���� ����
	}
	
	class InClass{				//�ν��Ͻ� ���� Ŭ����(class�տ� static�� ���� Ŭ����)
		int inNum = 100;
		//static int sInNum  = 200;		������ InClass������ Static �������� �ȵ�
		
		void inTest() {
			System.out.println("OutClass num =" + num +"(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum =" + sNum +"(�ܺ� Ŭ������ ���� ����)");
		}
		
		//static void sTest(){}  ������ InClass������ Static �޼ҵ嵵 �ȵ�
	}
	
	
	public void usingClass() {		//���� Ŭ������ Private ��� �ܺο��� ����� �� �ֵ��� �޼ҵ�
		inClass.inTest();		//���� Ŭ���� ������ ����Ͽ� �ż��� ȣ���ϱ�
	}
}


public class InnerTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("�ܺ� Ŭ���� �̿��Ͽ� ���� Ŭ���� ��� ȣ��");
		outClass.usingClass();	//����Ŭ���� ��� ȣ��
		
		
		//outClass.inClass.inTest();
		//OutClass.InClass inClass = outClass.new InClass();		
		//inClass.inTest();
		//�� private InClass���� private�ȵ��� ����� �� ����
	}

}
