package Exercise_Q6;

public class Grandeur extends Car{

	@Override
	public void startCar() {
		System.out.println("Grandeur ½Ãµ¿À»ÄÕ´Ï´Ù.");
	}

	@Override
	public void driveCar() {
		System.out.println("Grandeur ´Ş¸³´Ï´Ù.");
	}

	@Override
	public void stopCar() {
		System.out.println("Grandeur ¸ÙÃä´Ï´Ù.");
	}

	@Override
	public void turnOff() {
		System.out.println("Grandeur ½Ãµ¿ ²ü´Ï´Ù.");
	}

}
