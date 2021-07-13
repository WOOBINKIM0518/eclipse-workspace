package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args)throws IOException {//예외 처리 , 인풋 값외의 값이 입력될 경우
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R : 한며씩 차례로 할당");
		System.out.println("L :  쉬고 있거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("P : 우선순위가 높은 고객 먼저 할당");

		int ch =System.in.read();		
		Scheduler scheduler =null;  //객체형 변수 선언(Null) Scheduler 의 객체형 인스턴스 scheduler
										//Scheduler scheduler upcasting을 위한 변수 선언
										
		if(ch =='R' ||ch =='r') {
			scheduler = new RoundRobin();	// RoundRobin 객체가 Scheduler 타입으로 업캐스팅 
			}
		else if(ch =='L' ||ch =='l') {
			scheduler = new LeastJob();// LeastJob 객체가 Scheduler 타입으로 업캐스팅
		}
		else if(ch =='P' ||ch =='p') {
			scheduler = new PriorityAllocation();// PriorityAllocation 객체가 Scheduler 타입으로 업캐스팅
		}
		else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
		
	}

}
