package codes.mona.collections;

public interface MyStringList {

	public String getElement(int position);
	
	public void addElement(String element);
	
	// []a, b, c, d] addElement(2, "apple") -> [a, b, apple, c, d]]
	public void addElement(int position, String element);
	
	// [a, b, c, d] replaceElement(2, "apple") -> [a, b, apple, d]
	public void replaceElement(int position, String element);
	
	public int length();
}
