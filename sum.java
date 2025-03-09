package loop;

public class sum {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += i;
        }

        System.out.println("Sum of first " + n + " numbers is: " + sum);
    }
}