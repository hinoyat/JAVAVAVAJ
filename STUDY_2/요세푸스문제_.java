import java.io.*;
import java.util.*;
public class 요세푸스문제_ {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		Queue<Integer> que = new LinkedList<>();
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		System.out.println(N);
		System.out.println(K);
		
		for (int i = 1; i <= N ; i ++) {
			que.offer(i);
		}
		System.out.println(que);
	}
}
