
public class MethodOverloading3 {
	public void over(String s) {
		System.out.println("string version");
	}
	
	public void over(StringBuffer sb) {
		System.out.println("Stringbuffer version");
	}

	public static void main(String[] args) {
		
		MethodOverloading3 r = new MethodOverloading3();
		r.over("Raji");
		r.over(new StringBuffer("Raji"));
	
	}

}
