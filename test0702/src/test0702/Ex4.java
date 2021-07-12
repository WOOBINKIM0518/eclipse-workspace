package test0702;

public class Ex4 {

	public static void main(String[] args) {
		double score[][] = {{3.3, 3.4},
							{3.5, 3.6},
							{3.7, 4.0},
							{4.1, 4.2}};
		
		double sum =0;
		for ( int y =0; y<score.length; y++) // 행
			for (int t=0; t <score[y].length;t++)  // 열 
				sum += score[y][t];
				
				int n = score.length;
				int m = score[0].length;
				System.out.println("4년 전체 평점 평균은  : " + sum/(n*m));
		
	}

}
