import java.io.*;

public class Boj2562{
    public static void main(String[] args) throws IOException {
        int max = 0;
        int pos = 0;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();
        int now = 0;
        int cnt = 0;
        while(temp != null){
            cnt++;
            now = Integer.parseInt(temp);
            if(now > max){
                max = now;
                pos = cnt;
            }
            temp = br.readLine();
        }
        
        System.out.print(max + "\n" + pos);
    }
}
