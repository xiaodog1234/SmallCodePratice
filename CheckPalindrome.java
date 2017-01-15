package github;

public class CheckPalindrome {
	boolean checkPalindrome = false;
	public CheckPalindrome (String input){
		String reverse = "";
		checkPalindrome = true;
		for(int i = input.length()-1;i>=0;i--){
			reverse = reverse + input.charAt(i);
		}
		for(int i = 0;i<input.length();i++){
			Character begin = reverse.charAt(i);
			Character end = input.charAt(i);
			
			if(begin.compareTo(end)!=0){
				checkPalindrome = false;
				break;
			}
		}
	}
	public boolean checkPalindrome(){
		return checkPalindrome;
	}
}
