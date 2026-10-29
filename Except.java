package enacaspulation;

public class Except {
	public static void main (String...args) {
		System.out.println("startt");
		try {
			int a=10/2;
			int[]b= {10,20,30};
			System.out.println(b[0]);
			System.out.println(b[1]);
			System.out.println(b[2]);
			System.out.println(b[3]);
		}catch(Exception e) {
			System.out.println("catch block"+e);
		}
		System.out.println("end");

}
}
