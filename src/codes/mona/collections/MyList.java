package codes.mona.collections;

public interface MyList<T>{

	public T getElement(int position);
	
	public void addElement(T element);
	
	// []a, b, c, d] addElement(2, "apple") -> [a, b, apple, c, d]]
	public void addElement(int position, T element);
	
	// [a, b, c, d] replaceElement(2, "apple") -> [a, b, apple, d]
	public void replaceElement(int position, T element);
	
	public int length();
}
