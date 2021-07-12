package chapter05_객체지향.circle;


public class Order_Test {

	public static void main(String[] args) {

		Order ord =new Order();
		
		ord.orderNum = 20180312001L;
		ord.buyerID = "abc123";
		ord.orderDate = "2018냔 3월 12일";
		ord.buyerName = "홍길순";
		ord.productNum = "PD0345-12";
		ord.address = "서울시 영등포구 여의도동 20번지";
		
		
			System.out.println("주문번호 :" + ord.orderNum );
			System.out.println("주문자 아이디 : "+ ord.buyerID);
			System.out.println("주문 날짜 :" + ord.orderDate);
			System.out.println("주문자 이름 : " + ord.buyerName);	
			System.out.println("주문 상품 번호 : " + ord.productNum);	
			System.out.println("배송 주소 : " + ord.address);	
	}

}
