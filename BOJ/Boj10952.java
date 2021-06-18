import java.io.*;
import java.util.StringTokenizer;

public class Boj10952{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String newLine = br.readLine();
        StringTokenizer st = new StringTokenizer(newLine, " ");
        int result = Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
        while(result!=0){
            System.out.println(result);
            newLine = br.readLine();
            st = new StringTokenizer(newLine, " ");
            result = Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
        }
    }
}
