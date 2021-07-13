package scheduler;

public interface Scheduler {
	public void getNextCall();			//추상 메소드 , abstract가 생략됨
			//전화 콜을 가지고 오는 메소드
	public void sendCallToAgent();	 	//추상 메소드 , abstract가 생략됨 
			//전화 콜을 Agent에게 보내는 메소드
	
		
			//why ? class가 아니고 interface이기 때문에. abstract가 생략될 수 있다.
			//만약 interface가 아니고 추상method 였다면 abstract가 생략 될 수 없다.

}
