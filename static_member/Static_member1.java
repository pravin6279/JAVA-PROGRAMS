class Static_member1 
{
	int empid ;
	String emp_name;
	 static String Company_name = "Infosys";

	 Static_member1  ( int empid,String emp_name)
	{
		 this.empid= empid ;
		 this.emp_name  = emp_name ;
		
	}
		void display()
	{
		System.out.println(empid +" : "+emp_name+" : "+Company_name+" ");
	}

	public static void main(String[] args) 
	{
		
     Static_member1  obj = new Static_member1 (101,"Akshay");
	 obj.display();
	 Static_member1 obj2  =  new Static_member1(102,"Yogesh");
	 obj2.display();
	
	}
}
