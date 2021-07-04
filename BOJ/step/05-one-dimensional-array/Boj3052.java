import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Boj3052{
    public static void main(String[] args) throws IOException {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();
        while(temp != null){
            hashSet.add(Integer.parseInt(temp) % 42);
            temp = br.readLine();
        }
        System.out.print(hashSet.size());
    }
}
