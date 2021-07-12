package REVIEW;

public class ReviewBook {
	
	String title;
	String author;
	
	public ReviewBook(String t) {
		title = t; author = "작자미상";
	}
	
	public ReviewBook(String t, String a) {
		title = t; author = a;
	}
	
	public static void main(String[] args) {
		
		ReviewBook littlePrince = new ReviewBook("어린왕자","생텍쥐페리");
		ReviewBook loveStory = new ReviewBook("춘향전");
		
		System.out.println(littlePrince.title+" "+littlePrince.author);
		System.out.println(loveStory.title+" "+loveStory.author);
		
	}

}


