class Parent{
	public void display()
		{
			System.out.println("Parent class");
		}
	}
	class Child extends Parent{
		public void display()
		{
			System.out.println("Child class");
		}
	}


public class MethodOverriding {
	public static void main(String[] args) {
		Child C = new Child();
		C.display();

	}

}
