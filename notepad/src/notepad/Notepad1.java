package notepad;

public class Notepad1 {

	public static void main(String []args){
		
        Car taxi = new Car();
        Car suv = new Car();
        Car sonata = new Car();
        
        taxi.wheelCount = 10;
        suv.wheelCount = 4;
        sonata.wheelCount = 15; // 마지막 인스턴스의 값이 static변수에 저장되어 똑같이 출력
        
        System.out.println("taxi의 바퀴수:"+ taxi.wheelCount);
        System.out.println("suv의 바퀴수:"+ suv.wheelCount);
        System.out.println("sonata의 바퀴수:"+sonata.wheelCount);
    }
}