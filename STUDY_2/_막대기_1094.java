import java.io.*;
import java.util.*;

public class _¸·´ë±â_1094 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int stick = 64;
        int cnt = 0;
        int cur_stick = 0;
        
        while (true) {
        	if (cur_stick + stick <= X) {
        		cur_stick += stick;
        		cnt += 1;
        		if (cur_stick == X) {
        			break;
        		}
        	}else {
        		stick /= 2;
        		if (stick == 0) {
        			stick = 64;
        		}
        	}

        }
        System.out.println(cnt);
    }
}
