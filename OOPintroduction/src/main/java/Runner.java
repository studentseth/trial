import java.util.ArrayList;

public class Runner {
	
	public static void main(String[] args) {
		
		//build attributes. First thing you need is an access modifier
		
		
		Person p1= new Person();
		Person.name= "Feroza";
		p1.age= 23;
		p1.jobTitle= "Software Developer";
		
		/*System.out.println(p1.toString());*/		
		Person p2= new Person();
		Person.name= "Lalita";
		p2.age= 25;
		p2.jobTitle= "Head Consultant";
		
		Person p3= new Person();
		Person.name= "Alvin";
		p3.age= 21;
		p3.jobTitle= "Software Architect";
		
	
		ArrayList<Person> PersonList= new ArrayList<Person>(); 
		PersonList.add(p1);
		PersonList.add(p2);
		PersonList.add(p3);
		/*System.out.println(PersonList);*/
		
		PersonList.stream().forEach(System.out::println);
		
		/*System.out.println(p1.returnsAName());*/
		
		System.out.println(p1);
	
	}
	
	/*public String search() {
		ArrayList<Person> result = Arraylist.stream();
		
		
		return Person.name;
	
	}
	*/
	

}
