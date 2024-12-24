// class ThreadA implements Runnable
// {
//     @Override
//     @SuppressWarnings("CallToPrintStackTrace")
// 	public void run()
// 	{
// 		for(int i=1;i<=5;i++)
// 		{
// 			System.out.println("Hi");
// 			try {
// 				Thread.sleep(10);
// 			}catch(InterruptedException e) {
// 				e.printStackTrace();
// 			}
// 		}
// 	}
// }

// class ThreadB implements Runnable
// {
//     @Override
//     @SuppressWarnings("CallToPrintStackTrace")
// 	public void run()
// 	{
// 		for(int i=1;i<=5;i++)
// 		{
// 			System.out.println("Hello");
// 			try {
// 				Thread.sleep(10);
// 			}catch(InterruptedException e) {
// 				e.printStackTrace();
// 			}
// 		}
// 	}
// }

public class RunnableVsThrowable{
    public static void main(String[] args) throws NumberFormatException {   
    	
//    	ThreadA obj1=new ThreadA();
//    	ThreadB obj2=new ThreadB();
//    	Runnable obj1=new A();
//    	Runnable obj2=new B();
    	
    	
//    	Runnable obj1=new Runnable()
//    	{
//    		public void run()
//    		{
//    			for(int i=1;i<=5;i++)
//    			{
//    				System.out.println("Hello");
//    				try {
//    					Thread.sleep(10);
//    				}catch(InterruptedException e) {
//    					e.printStackTrace();
//    				}
//    			}
//    		}
//   		};
    	
    	Runnable obj1=()->
    	{
    		for(int i=1;i<=5;i++)
    		{
    			System.out.println("Hi");
    			try {Thread.sleep(1000);}catch(InterruptedException e) {e.printStackTrace();}
    		}
    	};
    	
    	Runnable obj2=()->
    	{
    		for(int i=1;i<=5;i++)
    		{
    			System.out.println("Hello");
    			try {Thread.sleep(1000);}
				catch(InterruptedException | IllegalArgumentException e) {e.printStackTrace();}
    		}
    	};
    	
    	Thread t1=new Thread(obj1);
    	Thread t2=new Thread(obj2);
    	 	
    	t1.start();
    	t2.start();
    }
    
}