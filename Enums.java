import java.util.Arrays;

enum Status{
    Running, Pending, Completed, Cancelled; //Objects of enum class, also known as NAMED CONSTANTS
}

public class Enums {
    @SuppressWarnings("ImplicitArrayToString")
    public static void main(String[] args) {
        Status s0= Status.Running;
    	Status s1= Status.Cancelled;
    	// Status s= Status.NoIdea; //It will give error because it is not a valid value
    	Status s2= Status.Completed;

    	System.out.println(s0);
    	System.out.println(s0.ordinal()); //Gives the index values of a particular values
    	
    	Status[] ss=Status.values(); //values() method returns the array of all the values
        System.out.println(ss); //This will print a weird output that contains the array instance instead of values
    	System.out.println(Arrays.toString(ss));
    	
    	for(Status s:ss) //Enhanced for loop to pass the array elements
    	{
    		// System.out.println(s);
    		System.out.println(s+" : "+s.ordinal());
    	}


		switch(s1) //One way to perform operations for each object in enums class
    	{
    		case Running -> System.out.println("All Good");
    			
    		case Cancelled -> System.out.println("Try Again");
    			
    		case Pending -> System.out.println("Please Wait");
    		
    		default -> System.out.println("Done");
    	}

		if(s2==Status.Running)  //Another way to perform operations on enums objects
    		System.out.println("All Good");
    	else if(s2==Status.Cancelled)
    		System.out.println("Try Again");
    	else if ( s2==Status.Pending)
    		System.out.println("Please Wait");
    	else
    		System.out.println("Done");
    }
}
