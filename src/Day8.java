import java.util.HashMap;
import java.util.Scanner;

public class Day8 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);

        HashMap<String, Integer> phonebook = new HashMap<>();

        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            phonebook.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.next();

            if (phonebook.containsKey(s)) {
                System.out.println(s + "=" + phonebook.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}