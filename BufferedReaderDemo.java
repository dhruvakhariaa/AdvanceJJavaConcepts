import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo{
    @SuppressWarnings("unused")
	public static void main(String[] args) throws IOException{   	
    	
//      try (Scanner sc = new Scanner(System.in)) {
//          int num=sc.nextInt();
//          System.out.println(num);
//      }

//    	System.out.println("Enter a number");
//    	int num=System.in.read();
//    	
//  	System.out.println(num);
//    	System.out.println(num-48);
    	
    System.out.print("Enter a number : ");
    	
   	InputStreamReader in=new InputStreamReader(System.in);
   	BufferedReader bf=new BufferedReader(in);
    	
   	int num=Integer.parseInt(bf.readLine());
   	System.out.println("The number you entered is "+num);
   	BufferedReader bfReader=new BufferedReader(in);
  	System.out.println(num-48);
    }
}
