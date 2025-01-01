import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//class Student implements Comparable<Student>
class Student{
	int age;
	String name;
	
	public Student(int age, String name){
		this.age=age;
		this.name=name;
	}
	
    @Override
	public String toString() {
		return "Student [age=" + age + ", name=" +name +"]";
	}

// 	@Override
// 	public int compareTo(Student o) {
// 	// throw new UnsupportedOperationException("Unimplemented method 'compareTo'");

// 		return Integer.compare(this.age, o.age); // Sort by age
// 	}
	
//	public int CompareTo(Student that){
//		return 0;
//		if(this.age >that.age)
//			return 1;
//		else
//			return -1;
//	}
}
	

public class ComparatorVsComparable{
    public static void main(String[] args){   
    	
//    	Comparator<Integer> com=new Comparator<Integer>(){
//    		public int compare(Integer i,Integer j){
//    			if(i%10 >j%10)
//    				return 1;
//    			else
//    				return -1;
//    		}
//    	};	
    	
//    	List<Integer> nums= new ArrayList<>();
//    	nums.add(43);
//    	nums.add(31);
//    	nums.add(72);
//    	nums.add(29);

//    	Collections.sort(nums);
//    	System.out.println(nums);
    	
//    	Comparator<Student> com=new Comparator<Student>(){
//    		public int compare(Student i,Student j){
//    			if(i.age >j.age)
//    				return 1;
//    			else
//    				return -1;
//    		}
//    	};	
    	
    	Comparator<Student> com=(i,j) -> i.age > j.age?1:-1;
     	
    	List<Student> studs= new ArrayList<>();
    	studs.add(new Student(21,"Dhruv"));
    	studs.add(new Student(12,"Nimit"));
    	studs.add(new Student(18,"Kaivalya"));
    	studs.add(new Student(20,"Darshil"));
    	
    	for(Student s:studs)
    		System.out.println(s);
    	
		System.out.println("\n\nSorted by age");
    	Collections.sort(studs, com);
    	for(Student s: studs)
    		System.out.println(s);
    }
}




    
