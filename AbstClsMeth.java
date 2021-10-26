
public class AbstClsMeth {

	public static void main(String[] args) {
      Iphone obj = new Tab();
      obj.call();
      obj.move();
      obj.cook();
      obj.fly();

	}

}
abstract class Iphone
{
	public void call()
	{
		System.out.println("Calling....");
	}
	public abstract void move();
	public abstract void cook();
	public abstract void fly();
}

abstract class Miphone extends Iphone
{
	public void move()
	{
		System.out.println("Moving....");
	}
}
class Tab extends Miphone
{
	public void cook() {
		System.out.println("Cooking....");
	}
	public void fly() {
		System.out.println("Flying....");
	}
}



