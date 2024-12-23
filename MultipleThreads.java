class FirstThread extends Thread
{
	@Override
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println("Hi");
		}
	}
}

class SecondThread extends Thread
{
    @Override
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println("Hello");
		}
	}
}

public class MultipleThreads{
    public static void main(String[] args) throws NumberFormatException {   
    	
    	FirstThread obj1 = new FirstThread();
		SecondThread obj2 = new SecondThread();
    	
//    	obj1.show();
//    	obj2.show();
    	
    	obj1.start();
    	obj2.start();
    }
    
}
