package github;

import java.util.Scanner;

public class mainFunc {
	public static void main(String[] args) {
		 Scanner keyboard = new Scanner(System.in);
		 
		 while(true){
			 System.out.println("enter a string");
			 String input = keyboard.nextLine();
			 if(input.equals("Q")||input.equals("q")){
				 break;
			 }
//		 	ReverseString aReverseString= new ReverseString(input);
//			PigLatin aPigLatin = new PigLatin(input);
//			CountVowels aCountVowels = new CountVowels(input);
//			CheckPalindrome aCheckPalindrome= new CheckPalindrome(input);
			
			 countWords acountWords= new countWords(input);
//		 	System.out.println(aReverseString.getString());
//			System.out.println(aPigLatin.getString()); 
//			System.out.println(aCountVowels.getTotal()); 
//			System.out.println(aCheckPalindrome.checkPalindrome());
			System.out.println(acountWords.getTotal());
		 }
	 }
	
	
}
