package woobin;

	public class Test_15_2 {
	    public static void main(String[] args) {
	    	int a,b;
	    	
	        for(int i = 1; i<= 99; i++) {
	        	
	        	a= i/10;
				b= i%10;
	        	
	            if(b == 3||b == 6||b == 9){  // �������� 3,6,9 _ �����ڸ�
	            	
	                if(a == 3||a == 6||a == 9)
	                    System.out.println(i + " �ڼ�¦¦");// ���ٰ� 10���ڸ��� 3,6,9
	                
	               else
	                    System.out.println(i + " �ڼ�¦");// �������� 3 ,6 ,9 _�����ڸ�
	            }
	            
	            
	            else if(a == 3||a == 6||a == 9) 
	                System.out.println(i + " �ڼ�¦");    // 10�� �ڸ�����  30,60,90
	        }
	    }
	}