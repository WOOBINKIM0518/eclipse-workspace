package p465_;

public class TestStringConcat2 {

	public static void main(String[] args) {
		
		
		String s1 = "Hello";
		String s2 = "World";
		
		
		StringConcat concat2 = (s ,v) -> System.out.println(s + ","+ v);
		concat2.makeString(s1, s2);
		
		
		 
		  StringConcat concat3 = new StringConcat(){ //람다식은 내부적으로 Anonymous클래스로 변환되어서 작동
		  
			  
			  
			  @Override
			  	public void makeString (String s1, String s2){
				  
				  
				  System.out.println(s1 + "," + s2);
		  	}
		  };
		  
		  
		  concat3.makeString(s1,s2);
		  
		  
		 
	}

}
