package chapter05_��ü����.circle;


public class Order_Test {

	public static void main(String[] args) {

		Order ord =new Order();
		
		ord.orderNum = 20180312001L;
		ord.buyerID = "abc123";
		ord.orderDate = "2018�� 3�� 12��";
		ord.buyerName = "ȫ���";
		ord.productNum = "PD0345-12";
		ord.address = "����� �������� ���ǵ��� 20����";
		
		
			System.out.println("�ֹ���ȣ :" + ord.orderNum );
			System.out.println("�ֹ��� ���̵� : "+ ord.buyerID);
			System.out.println("�ֹ� ��¥ :" + ord.orderDate);
			System.out.println("�ֹ��� �̸� : " + ord.buyerName);	
			System.out.println("�ֹ� ��ǰ ��ȣ : " + ord.productNum);	
			System.out.println("��� �ּ� : " + ord.address);	
	}

}
