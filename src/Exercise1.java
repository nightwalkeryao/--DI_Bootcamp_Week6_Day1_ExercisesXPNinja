
public class Exercise1 {

	int age = 20;
	double weight = 54;
	boolean isStudent = true;
	char gender = 'M';
	String name = "Yao";

	private void displayInfo() {
		System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Weight: " + weight
				+ ", IsStudent: " + isStudent);
	}

	public static void main(String[] args) {
		Exercise1 exo = new Exercise1();
		exo.displayInfo();
	}
}
