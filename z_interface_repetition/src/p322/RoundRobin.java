package p322;

public class RoundRobin implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�");
	}

	@Override
	public void senCallToAgent() {
		System.out.println("���� ���� �������� ����մϴ�.");
	}

}
