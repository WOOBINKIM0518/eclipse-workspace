// 06�� 22�� (ȭ) ��� ������(=��Ģ����)

package chapter03_������;

public class OperatorEx02 {

	public static void main(String[] args) {
		
		int mathScore = 95;
		int engScore = 70;
		
		int totalScore = mathScore + engScore;
		System.out.println("��Ż ���� : " + totalScore);
				
	
		// int avgScore = (mathScore + engScore) /2; ������ �Ҽ��� ����
		double avgScore = (mathScore + engScore) /2.0; 
		// �Ҽ������� ��Ȯ�ϰ� �Ϸ��� �ڷ��� double���  2.0���� ����  (2�� �����ϸ� ������ ��¾ȵ�)
		System.out.println("��� ���� : " + avgScore);
		
		
		
		int mod = mathScore % engScore;
		String ch1 = "���� �������� : ";  // String�� ��ü�������� Ÿ���̴� . 
		System.out.println(ch1 + mod);
	}
}
