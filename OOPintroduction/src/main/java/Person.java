
public class Person {
	
	//build attributes. First thing you need is an access modifier
	
	public static String name;
	public int age;
	public String jobTitle;

	
	
	
public String toString() {
	
	return  Person.name + " is " + Integer.toString(this.age) + " years old, and their job title is " + this.jobTitle;
	
}

/*public String returnsAName() {
	
	return this.name;
	
}

public String returnMethod() {
	return  this.name + " is " + Integer.toString(this.age) + " years old, and their job title is " + this.jobTitle;
	
}

	*/

}
