class A
{
    @SuppressWarnings("unused")
	int age;
	
	public void show()
	{
		System.out.println("in show");
	}
	
	class B
	{
		public void config()
		{
			System.out.println("in config");
		}
	}
	
	static class C
	{
		public void config()
		{
			System.out.println("in static config");
		}
	}
}


public class  InnerClass{
    public static void main(String[] args) {
    	A obj=new A();
    	obj.show();
    	
    	A.B obj1=obj.new B();
    	obj1.config();
    	
    	A.C obj2=new A.C();
    	obj2.config();

    }
}
