package test0702;

public class Ex4 {

	public static void main(String[] args) {
		double score[][] = {{3.3, 3.4},
							{3.5, 3.6},
							{3.7, 4.0},
							{4.1, 4.2}};
		
		double sum =0;
		for ( int y =0; y<score.length; y++) // ��
			for (int t=0; t <score[y].length;t++)  // �� 
				sum += score[y][t];
				
				int n = score.length;
				int m = score[0].length;
				System.out.println("4�� ��ü ���� �����  : " + sum/(n*m));
		
	}

}
