package baekjoon;

import java.util.*;


public class Zero_10773 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Stack <Integer> s = new Stack<Integer>();
		int K = sc.nextInt();
		for (int i=0; i<K; i++) {
			int num = sc.nextInt();
			if (num==0) {
				s.pop();
			}
			else {
				s.push(num);
			}
		}
		sc.close();
	
		int sum = 0;
		while(!s.isEmpty()) {
			sum +=s.pop();
		}
		System.out.println(sum);
	} 
}
