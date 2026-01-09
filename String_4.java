package com.tka.jan5;

public class String_4 {

	public static void main(String[] args) {
		
		String_4.convertUppercase();
		String_4.sentenceCase();
		
		//converted lowercase
		
		String s1 = "A man, a plan, a canal --panama";
		String result="";
		
		for(int i=0;i<s1.length();i++) {
			char ch = s1.charAt(i);
			
			if(ch>='A' && ch<='Z') {
				ch=(char)(ch+32);
			}
			result+=ch;
		}
	System.out.println("Original:-"+s1);
	System.out.println("converted String into lowercase:-"+result);
	System.out.println();
	}
	
	public static void convertUppercase() {
		String s1 = "A man, a plan, a canal --panama";
		String result="";
		
		for(int i=0;i<s1.length();i++) {
			char ch = s1.charAt(i);
			
			if(ch>='a' && ch<='z') {
				ch=(char)(ch-32);
			}
			result+=ch;
		}
		System.out.println("Original:-"+s1);
		System.out.println("converted String into uppercase:-"+result);
		System.out.println();
	}
	
	public static void sentenceCase() {
		String s1 = "A man, a plan, a canal --panama";
		String result="";
		
		String[] words = s1.split(" ");
		for(String word:words) {
			if(word.length()>0) {
				//convert first char to uppercase
				char firstChar =word.charAt(0);
				if(firstChar>='a' && firstChar<='z') {
					 firstChar=(char)( firstChar-32);
				}
				result+= firstChar+word.substring(1)+ " ";
			}
		}
		result=result.trim();
		
		System.out.println("Original String:-"+s1);
		System.out.println("Converted SentenceCase:-"+result);
		System.out.println();
		}

}
