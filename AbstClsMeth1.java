
public class AbstClsMeth1 {

	public static void main(String[] args) {
		bus b = new bus();
		System.out.println(b.getNoofWheel());
		
		auto a = new auto();
		System.out.println(a.getNoofWheel());
	}

}
abstract class vehicle
{
	public abstract int getNoofWheel();
}
class bus extends vehicle
{
	public int getNoofWheel()
	{
		return 6;
	}
}
class auto extends vehicle
{
	public int getNoofWheel()
	{
		return 3;
	}
}
