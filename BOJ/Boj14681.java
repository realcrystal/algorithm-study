import java.io.*;
public class Boj14681{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        if (x > 0 && y > 0) bw.write(Integer.toString(1));
        if (x < 0 && y > 0) bw.write(Integer.toString(2));
        if (x < 0 && y < 0) bw.write(Integer.toString(3));
        if (x > 0 && y < 0) bw.write(Integer.toString(4));
        bw.close();
    }
}
