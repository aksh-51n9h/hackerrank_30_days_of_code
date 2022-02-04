import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Day3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        String message;

        if ((N >> 1) << 1 == N) {
            if (N >= 2 && N <= 5) {
                message = "Not Weird";
            } else if (N >= 6 && N <= 20) {
                message = "Weird";
            } else {
                message = "Not Weird";
            }
        } else {
            message = "Weird";
        }

        System.out.println(message);
        bufferedReader.close();
    }
}
