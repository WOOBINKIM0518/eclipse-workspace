package p498_exception;

public class AutoCloseObj implements AutoCloseable {
	
	@Override
	public void close() throws Exception{		//throws Exception : throws<�̷��>
		
		System.out.println("���ҽ��� close() �Ǿ����ϴ�.");
	}
}
