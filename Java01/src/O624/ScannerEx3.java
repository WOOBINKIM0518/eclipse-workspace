//비교 연산자와 논리 연산자 사용하기

package O624;

public class ScannerEx3 {
public static void main(String[] args) {

	
		// 비교 연산
		System.out.println('a' > 'b');
		System.out.println(3 >= 2);
		System.out.println(-1 < 0);
		System.out.println(3.45 <= 2);
		System.out.println(3 == 2);
		System.out.println(3 != 2);
		System.out.println(!(3 != 2));
		// 비교 연산과 논리 연산 복합
		System.out.println((3 > 2) && (3 > 4));
		System.out.println((3 != 2) || (-1 > 0)); 
		// 노란 오류는 진행됨 근데 왜 떳어? -> 논리 합에서 앞에 식이 참인경우 뒤에식은 진행되지 않아
		// 그래서 없어도 되는거라 그런거야 ! 
		System.out.println((3 != 2) ^ (-1 > 0));

 	}
}
