class A{
	public void show() 
	{
		System.out.println("in A show");
	}
}
//class B extends A
//{
//	public void show()
//	{
//		System.out.println("in B Show");
//	}
//}

abstract class B{
	public abstract void show();
}

public class  AnonymousInnerClass{
    public static void main(String[] args) {
    	
    	//A obj=new B();
    	
    	A obj=new A() 
    	{
			@Override
    		public void show()
    		{
    			System.out.println("in A new show");
    		}
    	};
    	obj.show();

		B obj1 = new B()
		{
			@Override
			public void show(){
				System.out.println("in B new show");
			}
		};
		obj1.show();
    }
}