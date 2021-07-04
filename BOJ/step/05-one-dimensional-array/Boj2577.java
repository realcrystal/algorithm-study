import java.io.*;

public class Boj2577{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();
        int result = Integer.parseInt(a) * Integer.parseInt(b) * Integer.parseInt(c);
        
        int[] arr = new int[10];
        int num = 0;
        while(result != 0){
            num = result % 10;
            arr[num]++;
            result /= 10;
        }
        
        for(int i = 0; i < 10; i++){
            System.out.println(arr[i]);
        }
    }
}
