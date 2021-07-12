package Exercise_Q6;

public abstract class Car {

	public abstract void startCar();
	public abstract void driveCar();
	public abstract void stopCar();
	public abstract void turnOff();
	
	public void washCar(){
		System.out.println("세차를 합니다");
	}
	
	
	
	final public void run() {							
		
		startCar();										
		driveCar();
		stopCar();					
		turnOff();	
		washCar();
	}		
}
