class Driver 
{
	public static void main(String[] args) 
	{
		A1.Dog();  //Static 
		B1.Dog();   //Static
		B1 obj  = new B1();
		obj.Dog();
		
		// upcasting
		A1 obj2 = obj;
		obj2.Dog();

	}
}
