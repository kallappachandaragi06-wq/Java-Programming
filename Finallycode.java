package enacapsulation;

public class Finallycode {
	    public static void main(String[] args) {
	        try {
	            int a = 10 / 2;
	            System.out.println(a);
	        }
	        catch (Exception e) {
	            System.out.println("Exception occurred");
	        }
	        finally {
	            System.out.println("Finally block executed");
	        }
	    }
	}

