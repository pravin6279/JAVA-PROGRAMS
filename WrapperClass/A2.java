class A2 
{
	public static void main(String[] args) 
	{
		System.out.println("Autoboxing in Wrapper class");

		byte a = 121;
		Byte obj = a;
		System.out.println(a);
		System.out.println(obj);
		System.out.println("<<<<<<<<<<<<<<<<<<");

		short b =   121;
		Short obj2 =  b;
		System.out.println(b);
		System.out.println(obj2);
		System.out.println(">>>>>>>>>>>>>>>>>>>>");
		
		int c =  3545;
		Integer obj3  = c;
		System.out.println(c);
		System.out.println(obj3);
		System.out.println("<<<<<<<<<<<<<<<<<<<<");

		long d  = 9527547531L;
		Long obj4 = d;
		System.out.println(d);
		System.out.println(obj4);
		System.out.println(">>>>>>>>>>>>>>>>>>>");

		float f = 76.98f;
		Float obj5 = f;
		System.out.println(f);
		System.out.println(obj5);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<");

		double g = 56.87;
		Double obj6  = g;
		System.out.println(g);
		System.out.println(obj6);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");

		boolean p = false;
		Boolean obj7 = p;
		System.out.println(p);
		System.out.println(obj7);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<");

		char s = 'A';
		Character obj8  = s;
		System.out.println(s);
		System.out.println(obj8);
	}
}
