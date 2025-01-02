import java.util.*;

public class OrElse {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<String> list2 = Arrays.asList("Dhruv", "Rj", "Nimit", "Darshil", "Kaivlaya");

        Optional<Integer> nums = list1.stream()
                            .filter(n -> n%2 == 0)
                            .findFirst();
        
        // System.out.println(nums.get());

         //Cannot be used because nums is Integer Type and I am trying to pass a String
        // System.out.println(nums.orElse("There is no even number"));

        nums.ifPresentOrElse(  //Since I want to print message, I need to use ifPresentOrElse 
            System.out::println,
            () -> System.out.println("There is no even number")
        ); 

        String names = list2.stream()
                            .filter(n -> n.startsWith("Raj"))
                            .findFirst()
                            .orElse("There is no name starting with Raj");
        
        // System.out.println(names.get());
        System.out.println(names);


        Optional<String> names2 = list2.stream()
                            .filter(n -> n.startsWith("Dhruv"))
                            .findFirst();   

        System.out.println(names2.orElse("There is no name starting with Dhruv"));
    }
}
