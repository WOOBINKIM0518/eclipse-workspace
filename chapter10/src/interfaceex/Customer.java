package interfaceex;

public class Customer implements Buy, Sell {	//인터페이스는 다중 구현이 가능하다.

	@Override
	public void Buy() {
		System.out.println("구매하기");
	}
	
	@Override
	public void sell() {
		System.out.println("판매하기");
	}

	@Override
	public void order() {
		System.out.println("고객판매주문(customer)");
	}

}
                       