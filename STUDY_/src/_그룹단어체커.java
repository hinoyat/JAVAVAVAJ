package Java_step_by_step;

import java.util.Scanner;

public class _그룹단어체커 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int ans = 0;
        for (int i = 0 ; i < N; i ++ ){
            String word = scanner.nextLine();
            int[] check_lst = new int[26];

            char check = ' ';

            boolean group = true;

            for (int j = 0 ; j < word.length() ; j ++) {
                char w = word.charAt(j);
                if (w != check) {
                    if (check_lst[w - 'a'] != 0){
                        group = false;
                        break;
                    }
                check_lst[w - 'a'] += 1;
                check = w;
                }
            }
            if (group == true) {
                ans += 1;
            }
        }
    System.out.print(ans);

    }
}
