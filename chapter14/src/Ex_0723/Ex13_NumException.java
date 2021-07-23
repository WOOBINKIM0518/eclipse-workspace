package Ex_0723;

public class Ex13_NumException {

	public static void main(String[] args) {
		String[] stringNumber = { "23", "12", "3.141592", "998"};
		
		int i = 0;
		try {
			for(i=0; i<stringNumber.length; i++) {
				int j = Integer.parseInt(stringNumber[i]);
				System.out.println("수자로 변환된 값은" + j);
			}
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println(stringNumber[i]+"는 정수로 변환할수 없습니다.");
		}
		
		/*catch (NumberFormatException e) {
			System.out.println(stringNumber[i] + "는 정수로 변환할 수 없습니다.");
		}*/
		
	}

}
