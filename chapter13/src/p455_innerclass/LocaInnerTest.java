package p455_innerclass;

class Outer{
	private int outNum =100;		// �ν��ϼ� ���� : outNum
	private static int sNum =200;	// ���� ����		: sNum
	
	Runnable getRunnable(int i) {
		
		int num = 100;		// num final�� ������ , i�� final�� ������ 
		
		class MyRunnable implements Runnable{	//���� ���� Ŭ���� : �޼ҵ� ���ο� ����.
			int localNum = 10;
			
			@Override
			public void run() {
				//num = 200;			//������. ���������� ����� ��
				//i = 100;				// ������. �Ű� ���� ���� ��������ó�� ����� �ٲ�
				//localNum = 20;		//������ ���� ���� Ŭ�������� ����� ����
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = "+localNum);
				System.out.println("outNum = " + outNum + "(�ܺ� Ŭ���� �ν��Ͻ� ����)"	);
				System.out.println("Outer.sNum = " + Outer.sNum + "(�ܺ� Ŭ���� ��������)");
			}
		}
		return new MyRunnable();
	}
}




public class LocaInnerTest {
	public static void main(String[] args) {
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);
		runner.run();	//������ �����ֱ� , run() �� ����Ǹ鼭 , getRunnable() �޼����� ������ ����

	}

}
