import java.util.Arrays;
import java.util.List;

public class MethodRefEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Dhruv", "Raj", "Nimit", "Darshil", "Kaivlaya");

        List<String> uNames = names.stream()
                // .map(n -> n.toUpperCase()) 
                .map(String::toUpperCase) //This can be used when a method has to be called on the object
                .toList(); 

        uNames.forEach(System.out::println); //Just mention the class from which the method is 
    }
}
