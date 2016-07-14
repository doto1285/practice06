package prob4;

public class MyStack implements Stack{
	
	String[] buffer = null;
	int top = -1;

	public MyStack(int capcity) {
		if(capcity < 0) {
			buffer = new String[1];
		}
		buffer = new String[capcity];
	}
	
	@Override
	public void push(String item) {
		if(top+1 == buffer.length){
			resizeBuffer();
		}
		top++;
		buffer[top] = item;
	}

	@Override
	public String pop() throws MyStackEmptyException {
		if(top < 0) {
			throw new MyStackEmptyException();
		}
		return buffer[top--];
	}

	@Override
	public boolean isEmpty() {
		return top==-1;
	}

	@Override
	public int size() {
		return top+1;
	}
	
	private void resizeBuffer() {
		String[] temp = new String[buffer.length*2];
		for(int i=0; i<=top; i++){
			temp[i] = buffer[i];
		}
		buffer = temp;
	}

}
