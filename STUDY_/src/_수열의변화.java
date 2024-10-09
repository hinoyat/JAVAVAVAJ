package JAVA_STUDY;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class _수열의변화 {
    public static void  main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), ",");
        int[] lst = new int[N];
        for (int i = 0; i < N; i++) {
            lst[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            int[] lst2 = new int[N - 1];
            for (int j = 0; j < N - 1; j++) {
                lst2[j] = lst[j + 1] - lst[j];
            }
            lst = lst2;
            N--;
        }
        for (int i = 0; i < lst.length; i++) {
            System.out.print(lst[i]);
            if (i < lst.length - 1) {
                System.out.print(",");
            }
        }
        br.close();
    }

}
