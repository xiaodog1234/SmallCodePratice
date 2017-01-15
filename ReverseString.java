package github;

public class ReverseString {
	//Reverse a String – Enter a string and the program will reverse it and print it out.
	
	String reverseString = "";
	
	public ReverseString(String input){
		for(int i = input.length()-1; i>=0;i--){
			reverseString = reverseString + input.charAt(i);
		}
	}
	public String getString(){
		return reverseString;
	}
}
