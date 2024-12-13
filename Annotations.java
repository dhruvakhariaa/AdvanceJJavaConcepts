@Deprecated
class Aa{
	public void showTheDataWhichBelongsToThisClass(){
		System.out.println("in show A");
	}
}

class Bb extends Aa{
	@Override //Helps the compiler to know better
//	public void showTheDataWhichBelongToThisClass()
	public void showTheDataWhichBelongsToThisClass(){
		System.out.println("in show B");
	}
}

public class Annotations{
    public static void main(String[] args) {
    	
    	Bb obj=new Bb();
    	obj.showTheDataWhichBelongsToThisClass();
    	
    }
}
