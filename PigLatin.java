package github;
/*		RULES		*/
//
//	For words that begin with consonant sounds, all letters before the initial 
//	vowel are placed at the end of the word sequence. Then, "ay" (some people 
//	just add "a") is added, as in the following examples:
//
//	"pig" = "igpay"
//	"banana" = "ananabay"
//	"trash" = "ashtray"
//	"happy" = "appyhay"
//	"duck" = "uckday"
//	"glove" = "oveglay"
//	"latin" = "atinlay"
//	"dopest" = "opestday"
//	
//	When words begin with consonant clusters (multiple consonants that form one 
//	sound), the whole sound is added to the end when speaking or writing.
//
//	"cheers" = "eerschay"
//	"shoot" = "ootshay"
//
//	For words that begin with vowel sounds, one just adds "way" to the end. 
//	Examples are:
//
//	"eat" = "eatway"
//	"omelet" = "omeletway"
//	"are" = "areway"

public class PigLatin {
	String pigLatin = "";
	
	PigLatin(String input){
		for(int i = 0; i<input.length();i++){
			if(!isVowel(input.charAt(i))){
				pigLatin = pigLatin + input.charAt(i);
			}else{
				if(pigLatin.length()>0){
					pigLatin = input.substring(i, input.length())+pigLatin+"ay";
				}else{
					pigLatin = input + "way";
				}
				break;
			}
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
	public String getString(){
		return pigLatin;
	}
}
