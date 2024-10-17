import java.io.*;
import java.util.*;

public class _1913 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int find_Num = Integer.parseInt(br.readLine());
        
        int di[] = {-1, 0, 1, 0};
        int dj[] = {0, 1, 0, -1};
        int d = 0;
        
        int[][] arr = new int[N][N];
        int starti = N / 2;
        int startj = N / 2;
        
        int movecnt = 0;
        int max_movecnt = 1;
        
        int num = 1;
        int[] result = new int[2];
        
        while (true) {
            arr[starti][startj] = num;
            if (num == find_Num) {
                result[0] = starti + 1;
                result[1] = startj + 1;
            }
            
            if (num == N*N) break;
            
            num++;
            movecnt++;
            starti += di[d];
            startj += dj[d];
            
            if (movecnt == max_movecnt) {
                d = (d + 1) % 4;
                movecnt = 0;
                if (d == 0 || d == 2) {
                	max_movecnt++;
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }
        sb.append(result[0]).append(" ").append(result[1]);
        
        System.out.print(sb);
    }
}