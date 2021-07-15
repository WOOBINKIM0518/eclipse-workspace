package p360;

public class StringEquals {

	public static void main(String[] args) {

		String str1 =  new String("abc");		//String 클래스의 equal(),toString() 재정의
		String str2 = new String("abc");
		
		
		System.out.println(str1== str2);			// == : 객체의 주소(해쉬값)
		System.out.println(str1.equals(str2));		// equlals : 재정워 (문자열을 비교)
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		Integer i3 = 100; // new해서 쓰지말고 바로 요렇게 사용해라 
		
		
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		
		System.out.println("==================");
		System.out.println(str1);					//str1의 객체를 출력 할 때 문자열을 출력
		System.out.println(str2);
		System.out.println("==================");
		System.out.println(i1);
		System.out.println(i2);
	}

}
