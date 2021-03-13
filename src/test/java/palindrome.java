
public class palindrome {
	public static void main(String[] args) {
		System.out.println(biggestPalindrome("saippuakivikauppias"));
		
		String input = "Try    to    remove   extra   spaces."; 
		String inputNew = input; 
		 
		while (inputNew.contains("  ")) { 
			inputNew = inputNew.replace("  ", " "); 
		}
		  
		System.out.println(input); 
		System.out.println(inputNew); 

		
		
		
		
		
		
	}
	public static String biggestPalindrome(String str) { 
		str = str.toLowerCase(); 
		String biggestPalindrome = ""; 
		String[] arr = str.split(" "); 

		for(String each : arr) { 
			String reverse = ""; 
			for(int i = each.length() - 1; i >= 0; i--) {   	 	reverse += each.charAt(i); 
			} 
			if(each.equals(reverse) &&  each.length() > 
			biggestPalindrome.length()){ 
				biggestPalindrome = each;  	} 
		} 
		return biggestPalindrome; } 
	
	

}
