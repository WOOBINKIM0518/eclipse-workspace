package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.Buy();
		customer.sell();

		
		Buy buyer = customer;		//Buy Ÿ������ ��ĳ����
		buyer.Buy();
		//buyer.sell();  ȣ���� �Ұ��� �ϴ� 
		buyer.order();
		
		
		Sell seller = customer;		//Sell Ÿ������ ��ĳ����
		seller.sell();
		//seller.buy();  ȣ���� �Ұ��� �ϴ�
		seller.order();
		
		
		if(seller instanceof Customer) {//seller�� Customer Ÿ���� ��ĳ���� �Ѱ��̱� ������ CustomerŸ���� ������ �ִ�
					// �� true
			Customer customer2 = (Customer)seller;	//seller�� CustomerŸ������ �ٿ�ĳ����
			customer2.Buy();
			customer2.sell();
		}
		
		customer.order();
	}

}
