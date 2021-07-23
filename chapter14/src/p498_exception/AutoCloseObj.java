package p498_exception;

public class AutoCloseObj implements AutoCloseable {
	
	@Override
	public void close() throws Exception{		//throws Exception : throws<미루다>
		
		System.out.println("리소스가 close() 되었습니다.");
	}
}
