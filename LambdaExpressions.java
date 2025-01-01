@FunctionalInterface
interface A_6
{
//	void show();
	void show(int i);
//	void show(int i,int j);
}

@FunctionalInterface
interface B_6{
	int add(int i, int j);
}


public class LambdaExpressions{
    public static void main(String[] args) {
    	
 //   	A obj = () -> System.out.println("in Show");  
 //   	obj.show();
    	
//    	A obj = new A()
//    	{
//    		public void show(int i)
//    		{
//    			System.out.println("in show"+i);
//    		}
//    	};
//    	obj.show(5);
    	
//    	AaAa obj = (int i) ->System.out.println("in show "+i);
//    	obj.show(5);
    	
//    	A obj = (int i,int j) ->System.out.println("in show " + i + j);
//    	obj.show(5,8);
    	
    	A_6 obj = i -> System.out.println("in show "+ i);
    	obj.show(5);

		// B obj1 = new B(){ //Normal declaration of the anonymous inner class without lambda expressions
		// 	public int add(int i, int j){
		// 		return i+j;
		// 	}
		// };
		// System.out.println(obj1.add(5, 8));

		// B obj1 = (i,j) -> 
		// {
		// 	return i+j;
		// };
		// System.out.println(obj1.add(5, 8));

		B_6 obj1 = (i,j) -> i+j; // No need to write return keyword
		System.out.println(obj1.add(5, 8));
    }
}