class A_2{
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

abstract class B_2{
	public abstract void show();
}

public class  AnonymousInnerClass{
    public static void main(String[] args) {
    	
    	//A obj=new B();
    	
    	A_2 obj=new A_2() 
    	{
			@Override
    		public void show()
    		{
    			System.out.println("in A new show");
    		}
    	};
    	obj.show();

		B_2 obj1 = new B_2()
		{
			@Override
			public void show(){
				System.out.println("in B new show");
			}
		};
		obj1.show();
    }
}