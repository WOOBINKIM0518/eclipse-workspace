package interfaceex;

public interface Sell {
	
	void sell();		//pulbic abstract ������
	
	default void order() {
		System.out.println("�����ֹ�(sell)");
}
}