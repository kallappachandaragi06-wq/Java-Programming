package enacaspulation;

public class Overload {
	void add(String s)
	{
		System.out.println("1st");
	}
	void add(int a, int b)
	{
		System.out.println("2nd");
	}
	public static void main (String[]args) {
	Overload tt=new Overload();
	tt.add(2,3);
	tt.add("vdhvcghdc");
	}
}

