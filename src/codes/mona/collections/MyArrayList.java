package codes.mona.collections;

public class MyArrayList<T> implements MyList<T>{

	private Object[] array;
	private int length = 0;

	public MyArrayList(int capacity) {
		array = new Object[capacity];
	}

	@Override
	public T getElement(int position) {
		
		if(position >= length || position < 0) {
			throw new MyStringArrayListOutOfBoundException();
		}
		
		return (T)array[position];
	}

	@Override
	public void addElement(T element) {
		
		array[length] = element;
		length++;
	}
	
	@Override
	public void addElement(int position, T element) {
		
		Object[] newArrayList = new Object[length+1];
		
		for(int i = 0; i < position; i++) {
			newArrayList[i] = array[i];
		}
		
		newArrayList[position] = element;
		
		for(int i = position+1; i < length+1; i++) {
			newArrayList[i] = array[i-1];
		}
		array = newArrayList;
		length++;
	}

	@Override
	public void replaceElement(int position, T element) {
		
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
