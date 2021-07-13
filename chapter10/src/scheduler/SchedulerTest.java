package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args)throws IOException {//���� ó�� , ��ǲ ������ ���� �Էµ� ���
		System.out.println("��ȭ ��� �Ҵ� ����� �����ϼ���.");
		System.out.println("R : �Ѹ羿 ���ʷ� �Ҵ�");
		System.out.println("L :  ���� �ְų� ��Ⱑ ���� ���� �������� �Ҵ�");
		System.out.println("P : �켱������ ���� �� ���� �Ҵ�");

		int ch =System.in.read();		
		Scheduler scheduler =null;  //��ü�� ���� ����(Null) Scheduler �� ��ü�� �ν��Ͻ� scheduler
										//Scheduler scheduler upcasting�� ���� ���� ����
										
		if(ch =='R' ||ch =='r') {
			scheduler = new RoundRobin();	// RoundRobin ��ü�� Scheduler Ÿ������ ��ĳ���� 
			}
		else if(ch =='L' ||ch =='l') {
			scheduler = new LeastJob();// LeastJob ��ü�� Scheduler Ÿ������ ��ĳ����
		}
		else if(ch =='P' ||ch =='p') {
			scheduler = new PriorityAllocation();// PriorityAllocation ��ü�� Scheduler Ÿ������ ��ĳ����
		}
		else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
		
	}

}
