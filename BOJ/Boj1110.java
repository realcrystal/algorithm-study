import java.io.*;

public class Boj1110{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int left = n % 10;
        int right = (n / 10 + n % 10) % 10;
        int now = left * 10 + right;
        int count = 1;
        while(n != now){
            count++;
            left = now % 10;
            right = (now / 10 + now % 10) % 10;
            now = left * 10 + right; 
        }
        System.out.println(count);
    }
}
