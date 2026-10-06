package enacaspulation;

public class This
{
	int a = 22;
	int b =44;
	void m1(int a, int b) 
	{
//	System.out.println("Hello world " + (c + d));
	System.out.println("Hello world " + (a + b));
	System.out.println("Hello world " + (this.a + this.b));
	}
		
	public static void main(String[] args) 
	{
		This  vv = new This();
		vv.m1(2, 3);

	}
}


