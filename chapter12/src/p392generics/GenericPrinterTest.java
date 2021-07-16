package p392generics;

public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		
		
		
		
		
		/*powderPrinter.getMaterial()
		  powderPrinter.setMaterial(null);
		  powderPrinter.toString();*/
		
		
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();	//  다운캐스팅을 하지 않았다.
		System.out.println(powderPrinter);
		
		/*
		 * ==Powder객체 그대로 적용 
		  powder.doPrinting(); 
		 System.out.println(powder.toString()); */
		 
	
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
		
		
	}
}
