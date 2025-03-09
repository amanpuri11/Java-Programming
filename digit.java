package loop;

public class digit {
    public static void main(String[] args) {
        
        int n = 4325;
        
        while (n != 0) {
            int digit = n % 10;  
            System.out.println(digit);  
            n /= 10;  
        }
    }
}
