package Exercise_Q5;

public abstract class Car {

	public abstract void startCar();
	public abstract void driveCar();
	public abstract void stopCar();
	public abstract void turnOff();
	
	
	
	final public void run() {							
		
		startCar();										
		driveCar();
		stopCar();					
		turnOff();	
	}		
}
