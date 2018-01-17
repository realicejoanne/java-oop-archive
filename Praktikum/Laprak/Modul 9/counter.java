class counter {
	int n = 0;
	public int zero(){
		return n=0;
	}
	public int up(){
		return ++n;
	}
	public int down() throws counterException {
		if(n <= 0) throw new counterException(n+" countdown failed.");
		return --n;
	}
}