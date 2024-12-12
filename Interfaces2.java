// class - class -> extends
// class - interface -> implements
// interface - interface -> extends

interface A
{
//	public abstract void show();
//	public abstract void config();
	int AGE=44;            // final and static 
	String AREA="Mumbai";
	
	void show();
	void config();
}

interface X
{
	void run();
}
interface Y extends X
{
	
}

class B implements A,Y
{
	@Override
	public void show()
	{
		System.out.println("in show");
	}
    @Override
	public void config()
	{
		System.out.println("in cofing");
	}
	@Override
	public void run()
	{
		System.out.println("running...");
	}
}

public class Interfaces2{
    public static void main(String[] args) {

    	A obj;
    	obj=new B();
    	
    	obj.show();
    	obj.config();
    	
    	X obj1=new B();
    	obj1.run();
    	
 //   	A.area="Hyderabad";
    	
    	System.out.println(A.AREA);
        
    }
}
