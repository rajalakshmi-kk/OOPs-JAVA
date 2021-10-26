
public class MethodOverloading5 {
	public void load(int i,float f){
		System.out.println("int-float method");
	}
	public void load(float f,int i){
		System.out.println("float-int method");
	}
	public static void main(String[] args) {
		MethodOverloading5 r = new MethodOverloading5();
		r.load(120, 203f);
		r.load(203f,18);
//		r.load(203,18);   error
//		r.load(203f,18f);   error
	}
}
