package p407_collection.arraylist;

import java.util.ArrayList;

class MyStack{	// Stack : LIFO
				// ArrayList를 사용해서 Stack 자료형을 구현
	private ArrayList<String> arryStack = new ArrayList<String>();
	
	public void push(String data) {
		arryStack.add(data);
	}
	
	public String pop() {
		int len = arryStack.size();		//len : 총방의 갯수
		if(len==0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		
		return(arryStack.remove(len-1));		//마지막 방의 객체를 삭제
	}
}


public class StackTest {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}

}
