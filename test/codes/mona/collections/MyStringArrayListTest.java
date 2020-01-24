package codes.mona.collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class MyStringArrayListTest {

	@Test
	public void getCorrectElement() {
		
		MyStringArrayList myStringArrayList = new MyStringArrayList(3);
		
		myStringArrayList.addElement("apple");
		myStringArrayList.addElement("banana");
		myStringArrayList.addElement("cherry");
		
		assertEquals("banana", myStringArrayList.getElement(1));
	}
		
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void addsElementThrowsException() {
		MyStringArrayList myStringArrayList = new MyStringArrayList(1);
		
		myStringArrayList.getElement(1);
	}

}
