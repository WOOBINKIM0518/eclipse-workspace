package interfaceex;

public interface Calc {
		//interface�� ����� �߻�޼ҵ��� ����, ��������� �� �� ����.
	
	
	double PI = 3.14;		//public static final ������   ���
	int ERROR = -999999999; //public static final ������   ���
	
	int add (int num1, int num2);			//public abstract ������ ����θ��ְ� ������ ����
	int substract (int num1, int num2);		//
	int times (int num1, int num2);
	int divide (int num1 ,int num2);
	
	
}
