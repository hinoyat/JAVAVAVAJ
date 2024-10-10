import java.io.*;
import java.util.*;
import java.math.*;

public class _사탕선생_고창석 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < T; tc++) {
			br.readLine();
			BigInteger N = new BigInteger(br.readLine());
			BigInteger sum_candy = BigInteger.ZERO;
			for (int n = 0; n < N.intValue() ; n++) {
				BigInteger candy = new BigInteger(br.readLine());
				sum_candy = sum_candy.add(candy);
			}
			int pos = sum_candy.remainder(N).intValue();
			if (pos == 0) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		
	}
}
