package p383;

public class NewInstanceTest {

	public static void main(String[] args)throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
			Person person1 = new Person();		
					//�����ε� : ������ �ܰ迡�� üũ�� �Ѵ�.
					
			System.out.println(person1);
			
			Class pClass = Class.forName("p383.Person");	
			
			//�����ε� : ������ �ܰ迡���� üũ���� �ʰ� ����� üũ
			//pClass�� Class������ Ÿ���� ������
			//pClass�� ������ ���ο� �ν��Ͻ� ������ ����ȯ�� �ʿ��ϴ�.
			Person person2 = (Person)pClass.newInstance();
			System.out.println(person2);
		}
	}


