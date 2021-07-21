package p453_innerclass;			//<<���� ���� Ŭ���� ����>>


class OutClass{
	private int num =10;			//�ܺ� Ŭ������ �ν��Ͻ� ����			:num
	private static int sNum =20;	//�ܺ� Ŭ������ ��������	:sNum
	
	static class InStaticClass{
		int inNum =100;				//���� Ŭ������ �ν��Ͻ� ���� : intNum
		static int sInNum = 200;	//���� Ŭ������ ���� ���� : sInNum
		
		void inTest() {		//���� ���� Ŭ������ �Ϲ� �ż��� (�ν��Ͻ� �޼ҵ�)
			//num +=10;		//�ܺ� Ŭ������ �ν��Ͻ� ������ ����� �� ����
			//sNum +=10;	//�ܺ� Ŭ������ static ������ ��� ������
			//inNum +=10;   //���� Ŭ������ �ν��Ͻ� ���� (O)
			//sInNum +=10;	//���� Ŭ������ static ���� (O)
			
			System.out.println("InStaticClass inNum = " + inNum + "(���� Ŭ������ �ν��Ͻ����� ���)"); 
			System.out.println("InStaticClass inNum = " + sInNum + "(���� Ŭ������ �������� ���)"); 
			System.out.println("InStaticClass inNum = " + sNum + "(�ܺ� Ŭ������ �������� ���)"); 
			//System.out.println(num); ���� 
		}
		
		static void sTest() {		//���� ���� Ŭ������ static�޼���, ȣ�� : 	<<<	�ν��Ͻ� �̸� , Ŭ���� �̸� >>>
			//num +=10;				//�ܺ� Ŭ������ �ν��Ͻ� ������ ����� �� ����
			//inNum +=10;			//�ܺ� Ŭ������ ���� ���� ��밡��
			//inNum +=10;			//���� Ŭ������ �ν��Ͻ� ������ ����� �� ����
			//sInNum +=10;			//���� Ŭ������ ���� ���� ��� ����
			
			System.out.println("OutClass sNum = " + sNum + "(�ܺ�Ŭ������ ���� ���� ���");
			System.out.println("InStaticClass sInNum = " + sInNum + "(����Ŭ������ ���� ���� ���");
			//System.out.println(num);		//�ܺ� �ν��Ͻ� ����
			//System.out.println(inNum);	//���� �ν��Ͻ� ����
		}
	}
}

public class InnerTest {
	public static void main(String[] args) {
		
		//OutClass outclass = new OutClass(); ������ �ʾƵ� �Ʒ� ����
		
		// �ܺ� Ŭ���� �������� �ʰ� �ٷ� ���� ���� Ŭ���� ����
		OutClass.InStaticClass sInClass =new OutClass.InStaticClass();		//�ܺ� Ŭ������ �������� �ʰ� ���� Ŭ���� ��ü ����
		System.out.println("���� ���� Ŭ���� �Ϲ� �޼��� ȣ��");
		sInClass.inTest();
		System.out.println();
		System.out.println("���� ���� Ŭ������ ���� �ż��� ȣ��");
		OutClass.InStaticClass.sTest();										//���� ����Ŭ������ ���� �޼ҵ�� Ŭ���� �̸�����  �ٷ� ȣ��
																			//���� ����Ŭ������ ���� �޼ҵ�� �ν��Ͻ� �̸����ε� ȣ��
	}
}
