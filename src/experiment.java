
// Java Program Illustrating Instance variables
// Can not be Overridden

// Class 1
// Parent class
// Helper class
class Parent {
	// Declaring instance variable by name `a`
	int a = 10;
	public static void print()
	{
		System.out.println("inside B superclass");
	}
}

// Class 2
// Child class
// Helper class
class Child extends Parent {

	// Hiding Parent class's variable `a` by defining a
	// variable in child class with same name.
	int a = 20;

	// Method defined inside child class
	public static void print()
	{
		// Print statement
		System.out.println("inside C subclass");
	}
}

// Main class
public class experiment {

	// Main driver method
	public static void main(String[] args)
	{
		// Creating a Parent class object
		// Reference Parent
		Parent obj = new Child();

		// Calling print() method over object created
		obj.print();

		// Printing superclass variable value 10
		System.out.println(obj.a);

		// Creating a Child class object
		// Reference Child
		Child obj2 = new Child();
		obj2.print();
		// Printing childclass variable value 20
		System.out.println(obj2.a);
	}
}
