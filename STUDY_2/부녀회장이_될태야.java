import java.util.*;
import java.io.*;

public class 부녀회장이_될태야 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Test_case = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < Test_case ; tc ++) {
            int K = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());
            int[][] DP = new int[K + 1][N + 1];
            for (int n = 1; n <= N; n++) {
                DP[0][n] = n;
            }

            for (int k = 1; k <= K; k++) {
                for (int n = 1; n <= N; n++) {
                    DP[k][n] = DP[k - 1][n] + DP[k][n - 1];
                }
            }
            System.out.println(DP[K][N]);
        }
    }
}
