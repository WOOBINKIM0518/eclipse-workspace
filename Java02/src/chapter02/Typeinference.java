package chapter02;

public class Typeinference {

	public static void main(String[] args) {

		var i = 10;  // var 대신 int
		var j = 10.0;   //  var 대신 double or long
		var str = "hello";  // var 대신 String
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test";
		
	}

}
