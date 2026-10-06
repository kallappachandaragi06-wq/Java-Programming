package enacaspulation;

//
interface ABCD{
	void m1();
}
public class Name implements ABCD{
	public void m1() {
		System.out.println(" hello arati");
	}
	public static  void main (String [] args) {
		Name bb = new Name();
		bb.m1();
	}
	
}
