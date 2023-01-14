class Employee extends Company
{
	String emp_address;
  
    
Employee(String a ,int b ,double c ,String f) //make consructor
		{
		this.emp_name = a;
		this.emp_id=b;
		this.emp_sal= c;
		this.emp_address = f;
	}
    //create a one method for dispaly result

	public void Display()
	{
		System.out.println("Emp_name is :"+emp_name );
		System.out.println("Emp_id is : "+emp_id);
		System.out.println("Emp_sal :"+emp_sal);
		System.out.println("Emp Address : "+emp_address);

}
}
