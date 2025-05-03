package week1.day2;

public class FibonacciSeriesRange {

    public static void main(String[] args) {
    	// TODO Auto-generated method stub

      int value = 10;
       

        int a = 0, b = 1;

        System.out.print("Fibonacci series within range of the value declared: ");

        
        for (int i = 0; a <= value; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            
        }

      
    }

}
