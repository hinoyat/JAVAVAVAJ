import java.io.*;
import java.util.*;
/* �����̴� ���̰� 64cm�� ���븦 ������ �ִ�. ��� ��, �״� ���̰� Xcm�� ���밡 ������ �;�����. �����̴� ���� ������ �ִ� ���븦 �� ���� ����� �ڸ�������, Ǯ�� �ٿ��� ���̰� Xcm�� ���븦 ������� �Ѵ�.

���븦 �ڸ��� ���� ���� ����� �������� �ڸ��� ���̴�. �����̴� �Ʒ��� ���� ������ ���ļ� ���븦 �ڸ����� �Ѵ�.

�����̰� ������ �ִ� ������ ���̸� ��� ���Ѵ�. ó������ 64cm ���� �ϳ��� ������ �ִ�. �̶�, ���� X���� ũ�ٸ�, �Ʒ��� ���� ������ �ݺ��Ѵ�.
������ �ִ� ���� �� ���̰� ���� ª�� ���� �������� �ڸ���.
����, ������ �ڸ� ������ ���� �� �ϳ��� ������ �����ִ� ������ ������ ���� X���� ũ�ų� ���ٸ�, ������ �ڸ� ������ ���� �� �ϳ��� ������.
����, �����ִ� ��� ���븦 Ǯ�� �ٿ��� Xcm�� �����.
X�� �־����� ��, ���� ������ ��ģ�ٸ�, �� ���� ���븦 Ǯ�� �ٿ��� Xcm�� ���� �� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. */

public class _�����_1094 {
	static int x;
	
	public static int sticks(int num,int add_val, int cnt) {
		if (num == x) {
			return cnt;
		}
		
		return sticks(num, num, cnt + 1);
	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		
		int stick = 64;
	
	}
}
