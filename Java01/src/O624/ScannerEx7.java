package O624;

import java.util.Scanner;
	
public class ScannerEx7 {
 public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("������ �Է��ϼ��� :");
	int score= scanner.nextInt();
	
	System.out.print("�г��� �Է��ϼ��� : ");
	int grade = scanner.nextInt();
	
	if(score>=60) {
		if(grade !=4)
			System.out.println("�հ�");
		else if(score>=70)
			System.out.println("�հ�");
		else
		System.out.println("���հ�");}
	else
		System.out.println("���հ�");
	scanner.close();
	
 }
}
