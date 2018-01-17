class FullStackException extends RuntimeException {
	public FullStackException() {}
	public FullStackException(String msg){
		super(msg);
	}
}

class EmptyStackException extends RuntimeException {
	public EmptyStackException() {}
	public EmptyStackException(String msg){
		super(msg);
	}
}

public class Stack {
	private int size;
	private int top;
	Object[] elemen;

	public Stack(){
		this.size = 5;
		elemen = new Object[this.size];
		this.top = 0;
	}
	public Stack(int s){
		size = s;
		elemen = new Object[s];
		this.top = 0;
	}
	public int getSize(){
		return this.size;
	}
	public int getTop(){
		return this.top;
	}
	public void push(Object o){
		try {
			if (this.top == this.size){
				throw new FullStackException("Stack Full");
			}
			elemen[top] = o;
			top++;
		}
		catch (FullStackException ex){
			System.out.println("FullStackException" + ex.getMessage());
		}
	}
	public Object pop(){
		try {
			if(this.top == 0){
				throw new EmptyStackException("Stack Kosong");
			}
		}
		catch (EmptyStackException e){
			System.out.println("EmptyStackException: " + e.getMessage());
		}
		finally {
			Object temp = elemen[top];
			top--;
			return temp;
		}
	}
}