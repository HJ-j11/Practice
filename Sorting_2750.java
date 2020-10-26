package baekjoon;

import java.util.*;

public class Sorting_2750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for (int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		int min;
		int temp;
		for (int i=0; i<N; i++) {
			min = i;
			for (int j=i+1; j<N; j++) {
				if(arr[min]>arr[j]) {
					min=j;
				}
			}
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		for(int i=0; i<N; i++) {
			System.out.println(arr[i]);
		}
	}
}
