package p481_strea;

import java.util.ArrayList;
import java.util.List;

public class TravleTest {
	public static void main(String[] args) {
		
		TravelCustomer customerLee = new TravelCustomer("�̼���", 40, 100);
		TravelCustomer customerKim = new TravelCustomer("������", 20, 100);
		TravelCustomer customerHong = new TravelCustomer("ȫ�浿", 13, 50);
		List<TravelCustomer> customeList = new ArrayList<>();
		
		customeList.add(customerLee);
		customeList.add(customerKim);
		customeList.add(customerHong);
		
		System.out.println("==�� ��� �߰��� ������� ���==");
		customeList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		
		int total = customeList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("�� ���� ����� : " +total + "�Դϴ�.");
		
		System.out.println("==20�� �̻� �� ��� �����Ͽ� ���==");
		customeList.stream().filter(c -> c.getAge() >= 20)
		.map(c -> c.getName()).sorted().forEach(s-> System.out.println(s));
	}

}
