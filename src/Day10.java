import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Day10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        System.out.println(countOnes(toBinary(n)));

        bufferedReader.close();
    }

    static String toBinary(int n) {
        StringBuilder b = new StringBuilder();

        while (n != 0) {
            b.insert(0, (n % 2));
            n = n / 2;
        }

        return b.toString();
    }

    static int countOnes(String b) {
        int lastMaxCount = 0;

        int s = 0, e;
        for (e = 0; e < b.length(); e++) {
            char c = b.charAt(e);
            if (c == '0') {
                int temp = e - s;
                if (temp > lastMaxCount) {
                    lastMaxCount = temp;
                }
                s = e + 1;
            }
        }

        int temp = e - s;
        if (temp > lastMaxCount) {
            lastMaxCount = temp;
        }

        return lastMaxCount;
    }
}
