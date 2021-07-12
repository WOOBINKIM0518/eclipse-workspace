package witharraylist;

public class VIPCustomer extends Customer{
	
	private int agentID;  // VIP 고객 전담 상담원 ID
	double saleRatio;		// VIP 할인율 
	
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		// super();  상위 클래스의 생성자를 호출  super()상위 클래스의 기본생성자를 호출
		super(customerID,customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio	= 0.1;
		this.agentID = agentID;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price *bonusRatio;
		return price - (int)(price*saleRatio);  // VIP고객일 때 가격 할인 10% 
	}
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo()+  " 상담원 번호는 " + agentID + " 입니다.";
	}
	/*
	 * public int calcPrice(int price) { bonusPoint +=price*bonusRatio; return
	 * price-(int)(price*saleRatio); }
	 */
	
	public int getAgentID() {			//VIP 전담 상담원 agent ID
		return agentID;
	}
	/*
	 * public String showCustomerInfo() {
	 * 
	 * return customerName + "님의 등급 " +customerGrade + "이며, 보너스 포인트는 "+ bonusPoint +
	 * "  입니다."; }
	 */
}

