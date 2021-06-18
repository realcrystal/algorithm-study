import java.io.*;
import java.util.StringTokenizer;

public class Boj10951{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String newLine = br.readLine();
        StringTokenizer st = null;
        while(newLine != null){
            st = new StringTokenizer(newLine, " ");
            System.out.println(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()));
            newLine = br.readLine();
        }
    }
}
