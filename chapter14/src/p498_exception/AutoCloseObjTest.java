package p498_exception;

public class AutoCloseObjTest {
	
	public static void main(String[] args) {
		
		try(AutoCloseObj obj = new AutoCloseObj()){
			
			throw new Exception();
			
			//throw : ���������� Exception�� �߻� ��Ŵ
			//throws : Exception�� ȣ���� ������ ó�� �ϵ��� �̷��.
			
		}catch(Exception e) {
			
			System.out.println("���� �κ��Դϴ�");
			
		}
	}
}
