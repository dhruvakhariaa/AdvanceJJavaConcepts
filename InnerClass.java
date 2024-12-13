class AA
{
    @SuppressWarnings("unused")
	int age;
	
	public void show()
	{
		System.out.println("in show");
	}
	
	class BB
	{
		public void config()
		{
			System.out.println("in config");
		}
	}
	
	static class CC
	{
		public void config()
		{
			System.out.println("in static config");
		}
	}
}


public class  InnerClass{
    public static void main(String[] args) {
    	AA obj=new AA();
    	obj.show();
    	
    	AA.BB obj1=obj.new BB();
    	obj1.config();
    	
    	AA.CC obj2=new AA.CC();
    	obj2.config();

    }
}
