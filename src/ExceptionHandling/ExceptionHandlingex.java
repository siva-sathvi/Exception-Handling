package ExceptionHandling;

public class ExceptionHandlingex {
	public static void main(String[] args) {
	method2();
		
	}
		
		public static void method2(){
		int a=10;
	int b=0;
	int c=0;
	try {
 c=a/b;
	}
	
	catch(ArithmeticException e) {
		System.out.println("ArithmeticException ");
	}

	finally {
		 System.out.println("program execution end");
		}
	
System.out.println("c=" +c);

 }
}
