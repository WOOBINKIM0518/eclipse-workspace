package interfaceex;

public abstract class Calculator implements Calc {
			// �������̽��� �Ϻ� �޼��常 �����ϴ� ��� �߻�Ŭ����(abstract)�� �Ǿ�� �Ѵ�.
		
	@Override
	public int add(int num1, int num2) {
		return num1+num2;
	}

	@Override
	public int substract(int num1, int num2) {//�������̽��� �����ϴ� �ż��忡��
		return num1-num2;						// �ݵ�� public ġ �Ǿ�� �Ѵ�)
	}

	public void showInfo() {
		System.out.println("Calc �������̽��� �����ϼ̽��ϴ�.");

	}
	
}