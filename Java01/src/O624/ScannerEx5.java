// if-else ����ϱ�

package O624;

import java.util.Scanner;

public class ScannerEx5 {
 public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("���� �Է��Ͻÿ�: ");
	int number = scanner.nextInt();
	
	if(number %3==0)
		System.out.println("3�� ��� �Դϴ�.");
	else
		System.out.println("3�� ����� �ƴմϴ�.");
	scanner.close();
	
}
}
