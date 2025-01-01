// class - class -> extends
// class - interface -> implements
// interface - interface -> extends

interface A_5
{
//	public abstract void show();
//	public abstract void config();
	int AGE=44;            // final and static 
	String AREA="Mumbai";
	
	void show();
	void config();
}

interface X_1
{
	void run();
}
interface Y_1 extends X_1
{
	
}

class Bbbb implements A_5,Y_1
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

    	A_5 obj;
    	obj=new Bbbb();
    	
    	obj.show();
    	obj.config();
    	
    	X_1 obj1=new Bbbb();
    	obj1.run();
    	
 //   	A.area="Hyderabad";
    	
    	System.out.println(A_5.AREA);
        
    }
}
