@SuppressWarnings("unused")
class DhruvNewException extends Exception
{
	public DhruvNewException(String string)
	{
		super(string);
	}
}

class AModified
{
	public void show() throws ClassNotFoundException
	{
//    	try
//    	{
//    		Class.forName("Calc");
//    	}
//    	catch(ClassNotFoundException e)
//    	{
//    		System.out.println("Not able to find theh class");
//    	}
		
		Class.forName("Calc");
	}
}

public class ThrowsKeyword{
	
	static {
		System.out.println("Class Loader");
	}
	
    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {
    	
//    	try
//    	{
//    		Class.forName("Class");
//    	}
//    	catch(ClassNotFoundException e)
//    	{
//    		System.out.println("Not able to find theh class");
//    	}
    	
    	AModified obj=new AModified();
    	try {
    		obj.show();
    	}catch(ClassNotFoundException e)
    	{
    		e.printStackTrace();
    	}
    	
    	
    }
}
