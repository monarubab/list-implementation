package codes.mona.strings;

public class Palindrome {
	
	public boolean isPalindrome(String word){

		for(int i = 0; i < word.length()/2; i++){

			if(word.charAt(i)!=word.charAt(word.length()-1-i)){
				return false;
			}
		}
		return true;
	}

	// Was it a car or a cat I saw
	// "a ba"
	// "   aba"
	public boolean isPalindromeWithSpaces(String s){

		int r = s.length()-1;
		int l = 0;

		while(l<r){

			while(s.charAt(l)==' ' && l<r){
				l++;
			}

			while(s.charAt(r)==' ' && l<r){
				r--;
			}

			if(s.charAt(r)!=s.charAt(l)){
				return false;
			}

			l++;
			r--;
		}

		return true;
	}
}
