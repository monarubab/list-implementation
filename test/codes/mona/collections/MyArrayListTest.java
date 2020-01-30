package codes.mona.collections;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MyArrayListTest {

	@Test
	public void getCorrectElement() {
		
		MyArrayList<String> myStringArrayList = new MyArrayList<>(3);
		
		myStringArrayList.addElement("apple");
		myStringArrayList.addElement("banana");
		myStringArrayList.addElement("cherry");
		
		assertEquals("banana", myStringArrayList.getElement(1));
	}
		
	@Test(expected=MyStringArrayListOutOfBoundException.class)
	public void addElementThrowsException() {
		MyArrayList<String> myStringArrayList = new MyArrayList<>(1);
		
		myStringArrayList.getElement(1);
	}
	
	@Test
	public void setsCorrectLength() {
		
		MyArrayList<String> myStringArrayList = new MyArrayList<>(3);
		
		myStringArrayList.addElement("s");
		
		assertEquals(1, myStringArrayList.length());
	}
	
	@Test
	public void addsElementAtCorrectPosition() {
		
		MyArrayList<String> myStringArrayList = new MyArrayList<>(3);

		myStringArrayList.addElement("apple");
		myStringArrayList.addElement("cherry");
		
		myStringArrayList.addElement(1, "banana");
	
		assertEquals(3, myStringArrayList.length());
		assertEquals("apple", myStringArrayList.getElement(0));
		assertEquals("banana", myStringArrayList.getElement(1));
		assertEquals("cherry", myStringArrayList.getElement(2));
		}
	
	@Test
	public void replacesElementCorrectly() {
		
		MyArrayList<String> myStringArrayList = new MyArrayList<>(3);
		
		myStringArrayList.addElement("apple");
		myStringArrayList.addElement("cherry");

		myStringArrayList.replaceElement(1, "banana");
		
		assertEquals("banana", myStringArrayList.getElement(1));
	}
}
