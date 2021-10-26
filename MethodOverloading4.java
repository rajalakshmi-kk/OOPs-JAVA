
public class MethodOverloading4 {
	public void meth(int i) {
		System.out.println("general method");
	}
	
	public void meth(int... i) {
		System.out.println("var-arg method");
	}

	public static void main(String[] args) {
		MethodOverloading4 d = new MethodOverloading4();
		d.meth();
		d.meth(10,200);
		d.meth(2001);
	}

}
