class counterException extends Exception {
	String complaint;
	public counterException(String c){
		this.complaint = c;
	}
	public String toString(){
		return "counter Exception "+complaint;
	}
}