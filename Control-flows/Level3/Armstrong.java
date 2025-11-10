import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int original = number, sum = 0;

        while (original != 0) {
            int digit = original % 10;
            sum += Math.pow(digit, 3);
            original /= 10;
        }

        if (sum == number) System.out.println(number + " is an Armstrong Number");
        else System.out.println(number + " is NOT an Armstrong Number");
    }
}
