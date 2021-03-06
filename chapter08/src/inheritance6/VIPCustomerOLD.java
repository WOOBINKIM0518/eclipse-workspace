package inheritance6;

public class VIPCustomerOLD extends Customer{
	private int agentID;
	double saleRatio;
	
	public VIPCustomerOLD() {
		// super();  상위 클래스의 생성자를 호출  super()상위 클래스의 기본생성자를 호출
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio	= 0.1;
	}
	public int calcPrice(int price) {
		bonusPoint +=price*bonusRatio;
		return price-(int)(price*saleRatio);
	}
	
	public int getAgentID() {
		return agentID;
	}
	public String showCustomerInfo() {
		
		return customerName + "님의 등급 " +customerGrade + "이며, 보너스 포인트는 "+ bonusPoint + "  입니다.";
	}
}

