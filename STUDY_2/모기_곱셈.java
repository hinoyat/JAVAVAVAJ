import java.util.*;
import java.io.*;

public class 모기_곱셈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null) {
            // 지난 주 공간
            int mos = 0;
            int pupa = 0;
            int larva = 0;
            // 현재 공간
            int curmos = 0;
            int curpupa = 0;
            int curlarva = 0;

            StringTokenizer st = new StringTokenizer(line);
            // 첫 모기
            int M = Integer.parseInt(st.nextToken());
            mos += M;
            // 첫 번데기
            int P = Integer.parseInt(st.nextToken());
            pupa += P;
            // 첫 유충
            int L = Integer.parseInt(st.nextToken());
            larva += L;

            // 성충이 낳는 알의 수
            int E = Integer.parseInt(st.nextToken());

            // 유충 -> 번데기 비율
            int R = Integer.parseInt(st.nextToken());

            // 번데기 -> 성충 비율
            int S = Integer.parseInt(st.nextToken());

            // N번의 일요일
            int N = Integer.parseInt(st.nextToken());


            while (N > 0) {

                // 저번 주 유충 처리
                curpupa += larva / R;

                // 저번 주 번데기 처리
                curmos = pupa / S;

                // 저번 주 모기 처리
                curlarva += mos * E;

                // 이번 주 정보를 저번 주로 갱신
                mos = curmos;
                pupa = curpupa;
                larva = curlarva;

                // 현재 초기화
                curpupa = 0;
                curmos = 0;
                curlarva =  0;

                N --;
            }
            System.out.println(mos);
        }
    }

}
