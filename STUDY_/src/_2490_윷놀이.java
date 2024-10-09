package JAVA_STUDY;

import java.util.Scanner;
import java.util.Arrays;

public class _2490_윷놀이 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] game = new char[3];

    for (int i = 0 ; i < 3; i ++) {
        String input = scanner.nextLine();
        String[] order = input.split(" ");
        int[] real_order = new int[4];
        for (int j = 0 ; j < 4; j ++) {
            real_order[j] = Integer.parseInt(order[j]);
        }

        int stick = Arrays.stream(real_order).sum();

        switch (stick) {
            case 0:
                game[i] = 'D';
                break;
            case 1:
                game[i] = 'C';
                break;
            case 2:
                game[i] = 'B';
                break;
            case 3:
                game[i] = 'A';
                break;
            case 4:
                game[i] = 'E';
                break;
        }
    }
    for (int r = 0; r < 3; r ++) {
        System.out.println(game[r]);
    }

    }
}
