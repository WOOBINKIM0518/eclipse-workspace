package p407_collection.arraylist;

import java.util.ArrayList;

class MyQueue{
		//FIFO
		// ArrayList를 사용하여 Queue 자료형을 구현.
	
	private ArrayList<String> arrayQueue = new ArrayList();
	
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	public String deQueue() {
		int len = arrayQueue.size();		//len : 총 방의 갯수
		if(len == 0) {
			System.out.println("큐가 비었습니다.");
			return null;
		}
		
		return (arrayQueue.remove(0));
	}
}


public class QueueTest {
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		
		
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
	}

}
