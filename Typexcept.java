package enacaspulation;

public class Typexcept {
	public static void main (String...args) {
		System.out.println("start");
		try {
			int a=10/2;
			int[]b= {10,20,30};
			System.out.println(b[0]);
			System.out.println(b[1]);
			System.out.println(b[2]);
			System.out.println(b[3]);
		}catch(ArithmeticException e) {
		 System.out.println("Arithmetic block"+e);
		 
		}catch(ArrayIndexOutOfBoundsException e) {
			 System.out.println("Array INDEX block"+e);
		}
		System.out.println("END");
	}
}
