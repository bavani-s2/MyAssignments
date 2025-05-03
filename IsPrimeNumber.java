package week1.day2;

public class IsPrimeNumber {

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        int number = 13;

        
        boolean isPrime = true;

     
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
           
                isPrime = false;
                
            }
        }

        
        if (isPrime) {
            System.out.println(number + " is prime.");
        } else {
            System.out.println(number + " is not prime.");
        }
    }


}
