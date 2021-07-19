package p407_collection.arraylist;

import java.util.ArrayList;

class MyStack{	// Stack : LIFO
				// ArrayList�� ����ؼ� Stack �ڷ����� ����
	private ArrayList<String> arryStack = new ArrayList<String>();
	
	public void push(String data) {
		arryStack.add(data);
	}
	
	public String pop() {
		int len = arryStack.size();		//len : �ѹ��� ����
		if(len==0) {
			System.out.println("������ ������ϴ�.");
			return null;
		}
		
		return(arryStack.remove(len-1));		//������ ���� ��ü�� ����
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
