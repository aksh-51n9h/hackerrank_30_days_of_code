import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        while (n-- != 0) {
            String s = in.nextLine();

            StringBuilder evenPosString = new StringBuilder();
            StringBuilder oddPosString = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (i % 2 == 0)
                    evenPosString.append(c);
                else
                    oddPosString.append(c);
            }

            System.out.println(evenPosString + " " + oddPosString);
        }

    }
}
