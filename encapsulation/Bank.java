class Bank 
{
	String bank_name;
	String bank_address;
	private int bank_code;

	//getter method
	public int getbank_code()
	{
		return bank_code;
	}
	//setter method
	public void setbank_code(int bankcode)
	{
		this.bank_code= bankcode;
	}

	//construcator
	Bank(String a,String b ,int  c)
	{
		this.bank_name  = a;
		this.bank_address =b;
		this.bank_code = c;

	}
	public void Display()
	{
		System.out.println("Bank name is "+bank_name );
		System.out.println("Bank Address  is"+bank_address);
		System.out.println("Bank code is"+bank_code);
	}
}
