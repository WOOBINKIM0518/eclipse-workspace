package inheritance6;

public class VIPCustomer {
	
	private int customerID;
	private String customerName;
	private String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	private int agentID;
	double saleRatio;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio	= 0.1;
	}
	public int calcPrice(int price) {
		bonusPoint +=price+bonusRatio;
		return price-(int)(price*saleRatio);
	}
	
	public int getAgentID() {
		return agentID;
	}
	public String showCustomerInfo() {
		
		return customerName + "���� ��� " +customerGrade + "�̸�, ���ʽ� ����Ʈ�� "+ bonusPoint + "  �Դϴ�.";
	}
}
