 class Animal{
	
}
 class Monkey extends Animal{
	
}



public class MethodOverloading6 {
	public void zoo(Animal a) {
		System.out.println("animal version");
	}
	public void zoo(Monkey m) {
		System.out.println("monkey version");
	}
	public static void main(String[] args) {
		MethodOverloading6 q = new MethodOverloading6();
		Animal a = new Animal();
		q.zoo(a);
		
		Monkey m = new Monkey();
		q.zoo(m);
		
		Animal a1 = new Monkey();
		q.zoo(a1);
	}
}
