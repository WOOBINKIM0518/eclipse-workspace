package Exercise_Q6;

public class Avante extends Car{

	@Override
	public void startCar() {
		System.out.println("Avante 시동을켭니다.");
	}

	@Override
	public void driveCar() {
		System.out.println("Avante 달립니다.");
	}

	@Override
	public void stopCar() {
		System.out.println("Avante 멉춥니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Avante 시동 끕니다.");
	}

	
	

}
