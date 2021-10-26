
public class MethodOverloading2 {
	public void over(Object o) {
		System.out.println("Object version");
	}
	
	public void over(String s) {
		System.out.println("String version");
	}

	public static void main(String[] args) {
		
		MethodOverloading2 r = new MethodOverloading2();
		r.over(new Object());
		r.over("Raji");
		r.over(null);
	}

}
