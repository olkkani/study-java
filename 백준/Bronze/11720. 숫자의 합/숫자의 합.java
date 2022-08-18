import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] number = br.readLine().split("");

        int result = 0;
        for(int i = 0;i < n; i++ ){
            result += Integer.parseInt(number[i]);
        }

        System.out.println(result);
    }
}

