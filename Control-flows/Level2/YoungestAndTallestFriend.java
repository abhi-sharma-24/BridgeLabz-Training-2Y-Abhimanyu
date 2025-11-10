import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age1 = sc.nextInt(), height1 = sc.nextInt();
        int age2 = sc.nextInt(), height2 = sc.nextInt();
        int age3 = sc.nextInt(), height3 = sc.nextInt();

        int minAge = Math.min(age1, Math.min(age2, age3));
        int maxHeight = Math.max(height1, Math.max(height2, height3));

        if (minAge == age1) System.out.println("Amar is youngest");
        else if (minAge == age2) System.out.println("Akbar is youngest");
        else System.out.println("Anthony is youngest");

        if (maxHeight == height1) System.out.println("Amar is tallest");
        else if (maxHeight == height2) System.out.println("Akbar is tallest");
        else System.out.println("Anthony is tallest");
    }
}
