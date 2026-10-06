package enacaspulation;

class parent {
	private int a;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
		
	}
    }
class Enacap extends parent
{
	public static void main(String[] args) {
		Enacap bb = new Enacap();
		bb.setA(3);
		int ss = bb.getA();
		System.out.println(ss);
	}
}
