package scheduler;

public interface Scheduler {
	public void getNextCall();			//�߻� �޼ҵ� , abstract�� ������
			//��ȭ ���� ������ ���� �޼ҵ�
	public void sendCallToAgent();	 	//�߻� �޼ҵ� , abstract�� ������ 
			//��ȭ ���� Agent���� ������ �޼ҵ�
	
		
			//why ? class�� �ƴϰ� interface�̱� ������. abstract�� ������ �� �ִ�.
			//���� interface�� �ƴϰ� �߻�method ���ٸ� abstract�� ���� �� �� ����.

}
