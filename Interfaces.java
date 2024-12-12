interface A
{
//	public abstract void show();
//	public abstract void config();
	int AGE=44;            // final and static 
	String AREA="Mumbai";
	
	void show();  //All methods are public and abstract by default
	void config();
}

class B implements A
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
}

public class Interfaces{
    public static void main(String[] args) {

    	A obj;
    	obj=new B();
    	
    	obj.show();
    	obj.config();
    	
    	//A.AREA="Hyderabad";
    	
    	System.out.println(A.AREA);
        
    }
}
