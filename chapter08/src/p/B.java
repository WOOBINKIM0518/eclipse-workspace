package p;

public class B extends A{ 
	
	void set() {
	pub = 1;		//public :  모든 다른 패키지에서 접근
	pro = 2;		
	//protected : 같은 패기지일때 접근, 상속관계인 경우 다른 패키지에서도 가능
	def = 3;	// default : 같은 패키지일 때 접근가능/ 다른패키지에선 접근불가
//	pri = 4;	// private : 다른 클래스에서 접근 차단
	
	}

}
