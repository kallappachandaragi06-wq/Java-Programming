package enacaspulation;

public class Argument {
	void m1(int... c) {
		System.out.println("welcome to java");
	}
	public static void main(String... args) {
		Argument cc = new Argument();
		cc.m1();
		cc.m1(1);
		cc.m1(1,2,3);
		cc.m1(1,2,3,4,5);
		
		
	}

}
