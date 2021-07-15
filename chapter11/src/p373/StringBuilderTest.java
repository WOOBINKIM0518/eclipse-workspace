package p373;

public class StringBuilderTest {		//가비지가 발생되지 않는다.

	public static void main(String[] args) {
		
		String javaStr = new String("Java");
		System.out.println("javaStr 문자열 주소  : "+System.identityHashCode(javaStr));
		
		StringBuilder buffer = new StringBuilder(javaStr);	//String으로 부터 StringBuilder
		System.out.println("연산전 buffer 메모리 주소 : "+System.identityHashCode(buffer));
		
		buffer.append(" and");					//문자열 추가
		buffer.append(" android");				//문자열 추가
		buffer.append(" programming is fun!!!");//문자열 추가
		System.out.println("연산 후 buffer 메모리 주소 : "+ System.identityHashCode(buffer));
		
		javaStr = buffer.toString();		//String 클래스로 반환
		System.out.println(javaStr);
		System.out.println("연걸된 javaStr 문자열 주소 : "+System.identityHashCode(javaStr));
		
		
	}

}
