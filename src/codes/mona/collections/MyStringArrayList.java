package codes.mona.collections;

public class MyStringArrayList implements MyStringList {

	private String[] array;

	public MyStringArrayList(int capacity) {
		array = new String[capacity];
	}

	@Override
	public String getElement(int position) {
		return array[position];
	}

	@Override
	public void addElement(String element) {

		for (int i = 0; i < array.length; i++) {

			if (array[i] == null) {
				array[i] = element;
				return;
			}
		}
	}

	@Override
	public int length() {
		
		int length = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null)
				length++;
			else
				return length;
		}
		return length;
	}
}
