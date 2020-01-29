package codes.mona.strings;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PalindromeTest {
	
	@Test
	public void isPalindromeIsTrue() {
		
		Palindrome p = new Palindrome();
		
		assertEquals(true, p.isPalindrome("aba"));
		assertEquals(true, p.isPalindrome("a"));
		assertEquals(true, p.isPalindrome(""));
	}
	
	@Test
	public void isPalindromeIsFalse() {
		
		Palindrome p = new Palindrome();
		
		assertEquals(false, p.isPalindrome("abax"));
	}
	
	@Test
	public void isPalindromeWithSpacesIsTrue() {
		
		Palindrome p = new Palindrome();
		
		assertEquals(true, p.isPalindromeWithSpaces("was it a car or a cat i saw"));
	}
}
