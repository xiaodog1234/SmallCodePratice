package github;

public class CountVowels {
	// Enter a string and the program counts the number of vowels in the 
	// text. For added complexity have it report a sum of each vowel found. 
	String countVowels = "";
	int total= 0;
	public CountVowels (String input){
		for(int i = 0; i<input.length();i++){
			if(isVowel(input.charAt(i)))
				total++;
		}
	}
	boolean isVowel(Character letter){
		if(letter.compareTo('a')==0)
			return true;
		else if(letter.compareTo('A')==0)
			return true;
		else if(letter.compareTo('e')==0)
			return true;
		else if(letter.compareTo('E')==0)
			return true;
		else if(letter.compareTo('i')==0)
			return true;
		else if(letter.compareTo('I')==0)
			return true;
		else if(letter.compareTo('o')==0)
			return true;
		else if(letter.compareTo('O')==0)
			return true;
		else if(letter.compareTo('u')==0)
			return true;
		else if(letter.compareTo('U')==0)
			return true;
		else
			return false;
	}
	public int getTotal(){
		return total ;
	}
}
