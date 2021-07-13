package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.Buy();
		customer.sell();

		
		Buy buyer = customer;		//Buy 타입으로 업캐스팅
		buyer.Buy();
		//buyer.sell();  호출이 불가능 하다 
		buyer.order();
		
		
		Sell seller = customer;		//Sell 타입으로 업캐스팅
		seller.sell();
		//seller.buy();  호출이 불가능 하다
		seller.order();
		
		
		if(seller instanceof Customer) {//seller는 Customer 타입을 업캐스팅 한것이기 때문에 Customer타입을 가지고 있다
					// ㄴ true
			Customer customer2 = (Customer)seller;	//seller를 Customer타입으로 다운캐스팅
			customer2.Buy();
			customer2.sell();
		}
		
		customer.order();
	}

}
