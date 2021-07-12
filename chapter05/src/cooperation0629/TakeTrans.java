package cooperation0629;

public class TakeTrans {

	public static void main(String[] args) {
		Student studentJames = new Student("James", 5000);
		Student studentToms = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();
		
		Subway subwaygreen = new Subway("2È£¼±");
		studentToms.takeSubway(subwaygreen);
		studentToms.showInfo();
		subwaygreen.showInfo();
	}
}
