class DhruvModifiedException extends Exception{
	public DhruvModifiedException(String string) {
		super(string);
	}
}
	public class CustomException{
		public static void main(String[] args) {
			
	//    	int i=2;
	//   	int i=0;
			int i=20;
			int j=0;
	 
			
		try{
			j=18/i;
			if(j==0)
	//    		throw new Exception("I don't want to do print zero");
				throw new DhruvModifiedException("I dont want to print zero");
    	}catch(ArithmeticException e){
    		j=20/i;
    		System.out.println("that is default output"+e);

//    		System.out.println("Cannot divide by zero");
    	}catch(DhruvModifiedException e){
			System.out.println(e);
		}catch(Exception e){
			System.out.println("Something went wrong" + e.getMessage());
		}
    	System.out.println(j);
    	System.out.println("Bye");
    }
}
