package constructor;

public class PersonTest {

		public static void main(String[] args) {
//			Person personLee = new Person();
			Person personKim = new Person(); // �⺻������ ȣ��
			
			personKim.name= "������";
			personKim.weight= 85.5F;
			personKim.height=180.0F;
			
			Person personLee = new Person("�̼���",175,75);
			
			System.out.println("�̸���  "+personKim.name+"�����Դ� "+ +personKim.weight+"Ű��  " +personKim.height+" �Դϴ�.");
			System.out.println(personLee.name+personLee.height+personLee.weight);
			
			
		
		//personKim  // ctrl + spacebar ������ �������� ��ü �ڵ��ϼ�
		
		}
}
