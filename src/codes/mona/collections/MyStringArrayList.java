package codes.mona.collections;

public class MyStringArrayList implements MyStringList {

	private String[] array;
	private int length = 0;

	public MyStringArrayList(int capacity) {
		array = new String[capacity];
	}

	@Override
	public String getElement(int position) {
		
		if(position >= length || position < 0) {
			throw new MyStringArrayListOutOfBoundException();
		}
		
		return array[position];
	}

	@Override
	public void addElement(String element) {
		
		array[length] = element;
		length++;
	}
	
	@Override
	public void addElement(int position, String element) {
		
		String[] newArrayList = new String[length+1];
		
		for(int i = 0; i < position; i++) {
			newArrayList[i] = array[i];
		}
		
		newArrayList[position] = element;
		
		for(int i = position+1; i < length; i++) {
			newArrayList[i+1] = array[i];
		}
		array = newArrayList;//TODO
		length++;
	}

	@Override
	public void replaceElement(int position, String element) {
		
		if(position <= length || position > 0) {
			array[position] = element;
		}
		else {
			throw new MyStringArrayListOutOfBoundException();
		}
	}

	@Override
	public int length() {
		return length;
	}
}
