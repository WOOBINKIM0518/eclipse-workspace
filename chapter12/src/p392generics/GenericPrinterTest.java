package p392generics;

public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		
		
		
		
		
		/*powderPrinter.getMaterial()
		  powderPrinter.setMaterial(null);
		  powderPrinter.toString();*/
		
		
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();	//  �ٿ�ĳ������ ���� �ʾҴ�.
		System.out.println(powderPrinter);
		
		/*
		 * ==Powder��ü �״�� ���� 
		  powder.doPrinting(); 
		 System.out.println(powder.toString()); */
		 
	
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
		
		
	}
}
