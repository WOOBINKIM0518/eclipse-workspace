package p339;

import java.util.ArrayList;

public class Shelf {

	protected ArrayList<String> shelf;	//ArrayList<String>������ ������ ����
	
	public Shelf() {					//������
		shelf = new ArrayList<String>();
	}									//ArrayList<String> shelf = new ArrayList<String>();
	
	public ArrayList<String> getShelf(){	//getShelf()�޼ҵ� ȣ��� shelf��ü��	 ����
		return shelf;
	}
	
	public int getCount() {		//�迭�� ������ ����
		return shelf.size();
	}
}
