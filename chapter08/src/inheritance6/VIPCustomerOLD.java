package inheritance6;

public class VIPCustomerOLD extends Customer{
	private int agentID;
	double saleRatio;
	
	public VIPCustomerOLD() {
		// super();  ���� Ŭ������ �����ڸ� ȣ��  super()���� Ŭ������ �⺻�����ڸ� ȣ��
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
		
		return customerName + "���� ��� " +customerGrade + "�̸�, ���ʽ� ����Ʈ�� "+ bonusPoint + "  �Դϴ�.";
	}
}
