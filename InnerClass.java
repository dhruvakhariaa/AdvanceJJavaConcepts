class A_3
{
    @SuppressWarnings("unused")
	int age;
	
	public void show()
	{
		System.out.println("in show");
	}
	
	class B_3
	{
		public void config()
		{
			System.out.println("in config");
		}
	}
	
	static class C_1
	{
		public void config()
		{
			System.out.println("in static config");
		}
	}
}


public class  InnerClass{
    public static void main(String[] args) {
    	A_3 obj=new A_3();
    	obj.show();
    	
    	A_3.B_3 obj1=obj.new B_3();
    	obj1.config();
    	
    	A_3.C_1 obj2=new A_3.C_1();
    	obj2.config();

    }
}
