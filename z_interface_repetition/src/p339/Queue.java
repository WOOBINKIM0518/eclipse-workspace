package p339;

public interface Queue {
	void enQueue(String title);		//배열 맨 마지막에 큐를(요소를)추가
	String deQueue();				//배열의 맨 처음의 항목을 반환
	int getSize();
}
