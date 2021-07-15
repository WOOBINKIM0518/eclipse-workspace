package p396_extedns;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		powderPrinter.printing();
		
		
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		plasticPrinter.printing();
		
		
		
		GenericPrinter<Water> waterPrinter = new GenericPrinter<Water>();
		waterPrinter.setMaterial(new Water());
		waterPrinter.printing();//  Material클래스에 Water가 상속되지 않아서 적용안됨
		
		
		
		// 자료형이 생략 된 경우 자료형의 형변환을 해야한다
		GenericPrinter<Water> waterPrinter2 = new GenericPrinter<Water>();
		waterPrinter2.setMaterial(new Water());
		Water water = (Water)waterPrinter2.getMaterial();
		waterPrinter.printing();
		
	}

}
