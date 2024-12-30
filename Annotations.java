@Deprecated
class A_1{
	public void showTheDataWhichBelongsToThisClass(){
		System.out.println("in show A");
	}
}

class B_1 extends A_1{
	@Override //Helps the compiler to know better
//	public void showTheDataWhichBelongToThisClass()
	public void showTheDataWhichBelongsToThisClass(){
		System.out.println("in show B");
	}
}

public class Annotations{
    public static void main(String[] args) {
    	
    	B_1 obj=new B_1();
    	obj.showTheDataWhichBelongsToThisClass();
    	
    }
}
