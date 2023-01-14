class Pre_increment 
{
	public static void main(String[] args) 
	{   
		// increment value by 1 
		// and use the updated value
		 int  a = 15;
		 ++a;
		System.out.println(a);
		 
		 System.out.println("************************");
		 int b  = 15 ;
		 int c = ++b;
		 int d = ++c;
		 System.out.println(b);
		 System.out.println(c);
		 System.out.println(d);

		 System.out.println("***************************");

		 int e =  23;
		 int f  = 19;
		 int g = ++e + ++f;
		 System.out.println(e);
		 System.out.println(f);
		 System.out.println(g);
	}
}
