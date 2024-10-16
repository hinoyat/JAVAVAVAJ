import java.io.*;
import java.util.*;

public class _1236 {
    public static void main(String[] args) throws IOException {
        int row = 0;
        int col = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[][] arr = new String[N][M];

        for (int i = 0; i < N; i++) {
            String info = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = String.valueOf(info.charAt(j));
            }
        }

        for (int i = 0; i < N; i++) {
            int check = 0;
            for (int j = 0; j < M; j++) {
                if (arr[i][j].equals("X")) {
                    check += 1;
                }
            }
            if (check == 0){
                row ++;
            }
        }
        for (int i = 0; i < M; i++) {
            int check = 0;
            for (int j = 0; j < N; j++) {
                if (arr[j][i].equals("X")) {
                    check += 1;
                }
            }
            if (check == 0){
                col ++;
            }
        }
        System.out.println(Integer.max(row, col));
    }
}