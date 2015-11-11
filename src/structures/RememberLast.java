package structures;

public class RememberLast<T> {

	private T lastElement;
	private int numElements;
	
	public RememberLast() {
		numElements = 0;
		lastElement = null;
	}
	
	public T add(T element) {
		
		if (element == null) {
			throw new NullPointerException("RememberLast object can store null pointers.");
		}
		
		T prevLast = lastElement;
		lastElement = element;
		numElements++;
		return prevLast;
	}
	
	public static void main(String[] args) {
		RememberLast<Integer> ints = new RememberLast<>();
		RememberLast<String> strs = new RememberLast<>();

	}

}
