import java.io.*;
import java.util.*;
import java.math.*;

public class _��������_��â�� {

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
//			System.out.println("���� ��" + sum_candy);
			int pos = sum_candy.remainder(N).intValue();
//			System.out.println("������" + pos);
			if (pos == 0) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		
	}
}
