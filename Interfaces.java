interface A_4
{
//	public abstract void show();
//	public abstract void config();
	int AGE=44;            // final and static 
	String AREA="Mumbai";
	
	void show();  //All methods are public and abstract by default
	void config();
}

class B_4 implements A_4
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

    	A_4 obj;
    	obj=new B_4();
    	
    	obj.show();
    	obj.config();
    	
    	//A.AREA="Hyderabad";
    	
    	System.out.println(A_4.AREA);
        
    }
}
