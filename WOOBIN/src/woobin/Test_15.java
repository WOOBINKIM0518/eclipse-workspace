package woobin;

public class Test_15 {

	public static void main(String[] args) {
	     for (int i = 3; i < 100; i++) {
	            int unit = i % 10; // ������    
	            int ten = i / 10; //  ��     
	            if (i < 10) {
	                if (i % 3 == 0)
	                    System.out.println(i + " �ڼ� ¦");}
	            else {
	                if ((ten % 3 == 0) && (i % 10 == 0))            // 30, 60, 90
	                    System.out.println(i + " �ڼ� ¦");
	                else if ((unit % 3 == 0) && (ten % 3 == 0))     // �����ڸ�, �����ڸ� �Ѵ� 3�� ���
	                    System.out.println(i + " �ڼ� ¦¦");
	                else if ((unit % 3 == 0) || (ten % 3 == 0))     // 3�� ����� �� ��
					  System.out.println(i + " �ڼ� ¦");
	            }

	        }
	    }
	}