class ThreadOne extends Thread
{
    @SuppressWarnings("CallToPrintStackTrace")
	@Override
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class ThreadTwo extends Thread
{
	@Override
	@SuppressWarnings("CallToPrintStackTrace")
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class PriorityAndSleep{
    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) throws NumberFormatException {   
    	
    	ThreadOne obj1=new ThreadOne();
		ThreadTwo obj2=new ThreadTwo();
    	
//    	obj1.show();
//    	obj2.show();
    	
    	obj2.setPriority(Thread.MAX_PRIORITY);
    	System.out.println(obj1.getPriority());
    	
    	obj1.start();
    	try {
			Thread.sleep(2);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
    	obj2.start();
    }
    
}
