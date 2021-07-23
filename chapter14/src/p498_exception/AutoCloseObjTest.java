package p498_exception;

public class AutoCloseObjTest {
	
	public static void main(String[] args) {
		
		try(AutoCloseObj obj = new AutoCloseObj()){
			
			throw new Exception();
			
			//throw : 강제적으로 Exception을 발생 시킴
			//throws : Exception을 호출한 곳에서 처리 하도록 미룬다.
			
		}catch(Exception e) {
			
			System.out.println("예외 부분입니다");
			
		}
	}
}
