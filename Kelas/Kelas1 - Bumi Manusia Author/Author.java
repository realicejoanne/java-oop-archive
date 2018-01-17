class Author{
	private String name;
	private String email;
	private char gender;
	Author(String name, String email, char gender){
		this.name = name/*"Patricia Joanne"*/;
		this.email = email/*"realicejoanne"*/;
		this.gender = gender/*"f"*/;
	}
	String getName(){
		return this.name;
	}
	String getEmail(){
		return this.email;
	}
	void setEmail(String email){
		this.email = email;
	}
	char getGender(){
		return this.gender;
	}
	String toStrings(){
		return name + " (" + gender + ") at " + email;
	}
}