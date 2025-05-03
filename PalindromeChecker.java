package week1.day2;

public class PalindromeChecker {


	
	static int rem;
	static int reversedNumber;
	
		
		    public static boolean isPalindrome(int input) {
		        int originalNumber = input; 

		       
		        for (int i = input; i > 0; i /= 10) {
		        
		            rem = i % 10;
		            
		            
		            reversedNumber = reversedNumber * 10 + rem;
		        }

		       
		        return originalNumber == reversedNumber;
		    }


	
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        int input1 = 121;

        if (isPalindrome(input1)) {
            System.out.println(input1 + " is a palindrome.");
        } else {
            System.out.println(input1 + " is not a palindrome.");
        }
        
        int input2 = 122;

        if (isPalindrome(input2)) {
            System.out.println(input2 + " is a palindrome.");
        } else {
            System.out.println(input2 + " is not a palindrome.");
        }


    }

	


}
