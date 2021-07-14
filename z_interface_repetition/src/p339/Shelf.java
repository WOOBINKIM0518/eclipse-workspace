package p339;

import java.util.ArrayList;

public class Shelf {

	protected ArrayList<String> shelf;	//ArrayList<String>형식의 데이터 선언
	
	public Shelf() {					//생성자
		shelf = new ArrayList<String>();
	}									//ArrayList<String> shelf = new ArrayList<String>();
	
	public ArrayList<String> getShelf(){	//getShelf()메소드 호출시 shelf객체를	 리턴
		return shelf;
	}
	
	public int getCount() {		//배열의 각방의 숫자
		return shelf.size();
	}
}
