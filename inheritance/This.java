class This
{
	
	private String name ;
	private int age;

	This(String name ){
		this(20);
		System.out.println("Name of the student is :" +name );
	
	}
	This(int age)
	{
		System.out.println("Age of student is :"+age);
	}
	This()
	{
		this("Pravin");
	}


public static void main(String []args)
{
	This obj  =   new This();
	
	
}
}