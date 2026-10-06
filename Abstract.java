package enacaspulation;
 abstract class abcd
	{
		abstract void withdraw();
		abstract void deposit();
	}
	class Abstract extends abcd
	{
		void withdraw()
		{
			System.out.println("Debited");
		}
		void deposit()
		{
			System.out.println("Credited");
		}
		public static void main(String[] args)
		{
			Abstract tt = new Abstract();
			tt.withdraw();
			tt.deposit();
		}
	}



