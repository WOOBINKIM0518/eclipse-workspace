package notepad;

public class Notepad1 {

	public static void main(String []args){
		
        Car taxi = new Car();
        Car suv = new Car();
        Car sonata = new Car();
        
        taxi.wheelCount = 10;
        suv.wheelCount = 4;
        sonata.wheelCount = 15; // ������ �ν��Ͻ��� ���� static������ ����Ǿ� �Ȱ��� ���
        
        System.out.println("taxi�� ������:"+ taxi.wheelCount);
        System.out.println("suv�� ������:"+ suv.wheelCount);
        System.out.println("sonata�� ������:"+sonata.wheelCount);
    }
}