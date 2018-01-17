//A test driver for Person and its subclasses.

public class TestPerson{
	// Test Student class
	public static void main(String[] Args){
		Student s1 = new Student("Abah Ali","Jl. Mangga no.7");
		s1.addCourseGrade("D1104",73);
		s1.addCourseGrade("D1201",89);
		s1.printGrade();
		System.out.println("Average is "+s1.getAverageGrade());
	}
}