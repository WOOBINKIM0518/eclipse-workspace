package p465_;

public class TestStringConcat2 {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		StringConcat concat2 = (s ,v) -> System.out.println(s + ","+ v);
		concat2.makeString(s1, s2);
		
		
		/*
		 
		  StringConcat concat3 = new String Concat(){
		  
		  @Override
		  public void makeString (Stirng s1, String s2){
		  System.out.printl(s1 + "," + s2);
		  }
		  };
		  concat3.makeString(s1,s2);
		  
		  
		 */
	}

}
