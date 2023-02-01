
public class Person {

	private String name;
	private int age;
	private char gender;
	
	public Person() {
		super();
		this.name = "Unknown";
		this.age = 0;
		this.gender = 'U';
	}
	
	

	public Person(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	


	public Person(String name, int age) {
		this();
		this.name = name;
		this.age = age;
	}


	public void displayInfo() {
		System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender);
	}

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("Smith", 16, 'M');
		Person p3 = new Person("Adam", 11);
		
		p1.displayInfo();
		p2.displayInfo();
		p3.displayInfo();
	}

}
