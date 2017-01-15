package github;

public class countWords {
//	Counts the number of individual words in a string. 
	
	int total = 0;
	countWords(String input){
		String[] list = input.split(" ");
		total = list.length;
	}
	public int getTotal(){
		return total;
	}
}
