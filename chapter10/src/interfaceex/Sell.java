package interfaceex;

public interface Sell {
	
	void sell();		//pulbic abstract 생략됨
	
	default void order() {
		System.out.println("구매주문(sell)");
}
}