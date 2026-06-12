import java.util.*;
public class Sumofndigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of digits:");
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("Enter the digits:");
        for (int i = 0; i < n; i++) {
            int digit = sc.nextInt();
            sum += digit;
        }
        System.out.println("The sum of the digits is: " + sum);
        sc.close();
    }
}