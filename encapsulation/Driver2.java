class Driver2 
{
	public static void main(String[] args) 
	{
		Bank obj2 = new Bank("SBI","Pune",123456);
		obj2.Display();
		obj2.setbank_code(123);
		System.out.println(obj2.getbank_code());
		System.out.println("run Successfully");
	}
}
