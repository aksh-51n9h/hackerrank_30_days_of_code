import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        double y = scan.nextDouble();
        scan.nextLine();
        String z = scan.nextLine();

        System.out.println(i + x);
        System.out.println(d + y);
        System.out.println(s + z);

        scan.close();
    }
}