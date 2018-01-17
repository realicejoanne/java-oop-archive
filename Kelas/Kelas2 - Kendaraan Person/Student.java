//Student class, Person subclass

public class Student extends Person {
	//private instance variables
	private int numCourses;
	private String[] courses;
	private int[] grades;
	private static final int MAX_COURSES = 30;
	
	//constructor
	public Student (String name, String address){
		super(name,address);
		numCourses=0;
		courses=new String[MAX_COURSES];
		grades= new int [MAX_COURSES];
	}
	
	//describe itself
	@Override
	public String toString(){
		return "Student: "+super.toString();
	}
	
	//add a course and its grade = no validation in this method
	public void addCourseGrade(String course,int grade){
		courses[numCourses]=course;
		grades[numCourses]=grade;
		++numCourses;
	}
	
	//print add courses taken and their grade
	public void printGrade(){
		System.out.print(this);
		for(int i=0;i<numCourses;++i){
			System.out.print(" "+courses[i]+": "+grades[i]);
		}
		System.out.println();
	}
	
	//compute the average grade
	public double getAverageGrade(){
		int sum=0;
		for(int i=0;i<numCourses;i++){
			sum+=grades[i];
		}
		return (double)sum/numCourses;
	}
}
