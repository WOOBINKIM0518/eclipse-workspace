package test0702_alonge;

public class Ex3_3 {
	enum Week {��,ȭ,��,��,��,��,��}
	
	public static void main(String[] args) {
		int [] n = {1,2,3,4,5};
		String names[] = {"���","��","�ٳ���","ü��","����","����"};
		
		int sum = 0;
		
		for ( int k : n) { // for (int k =0 ; k<n.length;k++)
			sum += k;
			System.out.print(" "+k);		}
			System.out.println("  " + "���� " + sum);
			
			for (String s : names) {
				System.out.print(" " + s);
				
			}
			System.out.println();
			for (Week day : Week.values())
				System.out.print(day + "���� ");
	}

	}


