package github;

public class countWords {
//	Counts the number of individual words in a string. For added complexity 
//	read these strings in from a text file and generate a summary.
	int total = 0;
	countWords(String input){
		input.split(" ");
		total = input.length();
	}
	public int getTotal(){
		return total;
	}
}
