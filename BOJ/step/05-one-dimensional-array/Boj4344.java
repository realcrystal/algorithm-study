/*
입력
첫째 줄에는 테스트 케이스의 개수 C가 주어진다.

둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

출력
각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Boj4344{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());
        int N;
        int sum;
        StringTokenizer st;
        for(int i = 0; i < C; i++){
            st = new StringTokenizer(br.readLine(), " ");
            N = Integer.parseInt(st.nextToken());
            
            sum = 0;
            int[] scores = new int[N];
            for(int j = 0; j < N; j++){
                scores[j] = Integer.parseInt(st.nextToken());
                sum += scores[j];
            }
            double average = (double) sum / (double) N;
            
            int cnt = 0;
            for(int k = 0; k < N; k++){
                if(scores[k] > average){
                    cnt++;
                }
            }
            
            System.out.println(String.format("%.3f", (double) cnt / (double) N * 100.0) + "%");
        }
    }
}
