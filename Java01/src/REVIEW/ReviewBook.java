package REVIEW;

public class ReviewBook {
	
	String title;
	String author;
	
	public ReviewBook(String t) {
		title = t; author = "���ڹ̻�";
	}
	
	public ReviewBook(String t, String a) {
		title = t; author = a;
	}
	
	public static void main(String[] args) {
		
		ReviewBook littlePrince = new ReviewBook("�����","�������丮");
		ReviewBook loveStory = new ReviewBook("������");
		
		System.out.println(littlePrince.title+" "+littlePrince.author);
		System.out.println(loveStory.title+" "+loveStory.author);
		
	}

}


