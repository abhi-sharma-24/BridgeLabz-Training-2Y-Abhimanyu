import java.util.Scanner;

public class PowerWhileloop {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exp = sc.nextInt();

        int result = 1, counter = 0;
        while (counter < exp) {
            result *= base;
            counter++;
        }
        System.out.println(base + "^" + exp + " = " + result);
    }
}
