package loop;

public class sum2 {
    public static void main(String[] args) {
        int n = 4325;
        int lastDigit = n % 10;
        
        while (n >= 10) {
            n /= 10;
        }
        
      int firstDigit = n;
      int sum = firstDigit + lastDigit;
        
        System.out.println("Sum of first and last digit: " + sum);
    }
}