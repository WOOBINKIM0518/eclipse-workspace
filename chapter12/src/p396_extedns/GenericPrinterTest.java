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
		waterPrinter.printing();//  MaterialŬ������ Water�� ��ӵ��� �ʾƼ� ����ȵ�
		
		
		
		// �ڷ����� ���� �� ��� �ڷ����� ����ȯ�� �ؾ��Ѵ�
		GenericPrinter<Water> waterPrinter2 = new GenericPrinter<Water>();
		waterPrinter2.setMaterial(new Water());
		Water water = (Water)waterPrinter2.getMaterial();
		waterPrinter.printing();
		
	}

}
