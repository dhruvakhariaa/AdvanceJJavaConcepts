import java.util.Arrays;

enum Status{
    Running, Pending, Completed, Cancelled; //Objects of enum class
}

public class Enums {
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
    }
}
