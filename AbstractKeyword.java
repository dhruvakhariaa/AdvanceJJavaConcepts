abstract class Car{	//Abstract classes are used to provide blueprint for their child classes
	public abstract void drive(); //Abstract methods don't need any definition
	public abstract void fly();
	
	public void playMusic()
	{
		System.out.println("Play music");
	}
}

abstract class WagnoR extends Car{   //Since we cannot define the fly() method here, we have to keep this class as abstract

    @Override
	public void drive()
	{
		System.out.println("Driving...");
	}
}

class UpdateWagnoR extends WagnoR   //concrete class
{
	@Override
	public void fly()
	{
		System.out.println("Flying...");
	}
}

public class  AbstractKeyword{
    public static void main(String[] args) {

 //   	Car obj=new Car();
 //   	Car obj=new WagnoR();
 //     Cannot create the objects of above 2 classes because they are abstract classes
    	Car obj=new UpdateWagnoR();
    	obj.drive();
    	obj.playMusic();
		obj.fly();
    }
}