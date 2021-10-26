
public class MethodOverloading {

	public static void raji() {
		System.out.println("empty method");
	}
	
	public static void raji(int a) {
		System.out.println(a);
	}
	
	public static void raji(int a,String b) {
		System.out.println(a+" "+b);
	}
	public static void main(String[] args) {
		raji(2021,"August-26");
		raji(6);
		raji();
	}

}
