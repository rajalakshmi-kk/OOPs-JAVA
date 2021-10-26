
public class MethodOverloading1 {
	public void load(int i)
	{
		System.out.println("int argument method");
	}
	
	public void load(float f)
	{
		System.out.println("float argument method");
	}
	
	public static void main(String[] args) {
		MethodOverloading1 m = new MethodOverloading1();
		m.load(10);
		m.load(10.4f);
		m.load('r');
		m.load(10l);
	}

}
