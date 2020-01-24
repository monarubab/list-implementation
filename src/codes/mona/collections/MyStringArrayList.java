package codes.mona.collections;

import static org.junit.Assert.assertSame;

public class MyStringArrayList implements MyStringList {

	private String[] array;
	private int length = 0;

	public MyStringArrayList(int capacity) {
		array = new String[capacity];
	}

	@Override
	public String getElement(int position) {
		return array[position];
	}

	@Override
	public void addElement(String element) {
		
		array[length] = element;
		length++;
	}
	
	@Override
	public void addElement(int position, String element) {
		
		array[position] = element;
	}

	@Override
	public int length() {
		return length;
	}
	
	public static void main(String[] args) {
	MyStringArrayList myStringArrayList = new MyStringArrayList(1);
		
		System.out.println(myStringArrayList.getElement(1));
	}
}
