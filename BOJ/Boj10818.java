import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int max = -1000001;
        int min = 1000001;
        int now = 0;
        while(st.hasMoreTokens()){
            now = Integer.parseInt(st.nextToken());
            if(now > max) max = now;
            if(now < min) min = now;
        }
        System.out.print(min + " " + max);
    }
}
