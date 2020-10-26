package baekjoon;
import java.util.*;

public class Blackjack_2798 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); int M = sc.nextInt();
		int array[] = new int[N];
		
		for (int i=0; i<N; i++) {
			array[i] = sc.nextInt();
		}
		
		int sum = 0;
		int result = 0;
		for (int i=0; i<N-2; i++) {
			for (int j=i+1; j<N-1; j++) {
				for(int k=j+1; k<N; k++) {
					sum = array[i] + array[j] + array[k];
					if (sum<=M && sum>result) {
						result = sum;
						}
					}
				}
			}
		System.out.println(result);
		}
}
