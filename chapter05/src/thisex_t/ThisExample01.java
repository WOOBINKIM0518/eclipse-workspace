package thisex_t;


	
	class BirthDay {
		
		int day;
		int month;
		int year;
		
		public void setYear(int year) {
			this.year =year;
		}

		public void printThis() {
			System.out.println(this);		//this�� ����Ű�� ��ü�� �� �޸� �ּ�
		}

		
		
	public static void main(String[] arg) {
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000);
		System.out.println(bDay);		//bDay ��ü�� RAM�� ���ּ� ���(JVM�̸��������ּ�)) ==>thisex.BirthDay@123a439b
		bDay.printThis();				//bDay�� ����Ű�� ���޸� �ּ�  ==>thisex.BirthDay@123a439b
		
		System.out.println(bDay.year);

	}

}

