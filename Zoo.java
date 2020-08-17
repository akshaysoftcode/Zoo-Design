package programs;

import java.util.Scanner;

public class Zoo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] maxarea = new int[3];
		int t = 0, s = 0, value1 = 0, value2 = 0, value3 = 0, g = 0, h = 0;

		int[] cost = new int[3];

		for (int i = 0; i < 3; i++) {
			cost[i] = sc.nextInt();
		}

		for (int i = 0; i < 3; i++) {
			maxarea[i] = sc.nextInt();
		}
		int[] herb = new int[2];
		int[] carn = new int[2];
		int[] aq = new int[2];

		for (int i = 0; i < 2; i++) {
			herb[i] = sc.nextInt();
		}
		for (int i = 0; i < 2; i++) {
			carn[i] = sc.nextInt();
		}
		for (int i = 0; i < 2; i++) {
			aq[i] = sc.nextInt();
		}
		int total = sc.nextInt();

		int maxValue = cost[0];
		for (int i = 0; i < cost.length; i++) {
			if (cost[i] > maxValue) {
				maxValue = cost[i];

			}
		}
		// System.out.println("maxv"+ maxValue+"::"+i);
		for (int i = 0; i < cost.length; i++) {
			if (maxValue == cost[i]) {
				g = i;
			}
		}

		if (g == 0) {
			value1 = herb[0] * herb[1];
			s = value1;
			value1 *= maxValue;
		}
		if (g == 1) {
			value1 = carn[0] * carn[1];
			s = value1;
			value1 *= maxValue;
		}
		if (g == 2) {
			value1 = aq[0] * aq[1];
			s = value1;
			value1 *= maxValue;
		}

		int minValue = cost[0];
		for (int i = 1; i < cost.length; i++) {
			if (cost[i] < minValue) {
				minValue = cost[i];
			}
		}
		// System.out.println("minv"+ minValue+"::"+i);

		for (int i = 0; i < cost.length; i++) {
			if (minValue == cost[i]) {
				h = i;
			}
		}

		if (h == 0) {
			t = maxarea[0];
			value2 = minValue * maxarea[0];
		}
		if (h == 1) {
			t = maxarea[1];
			value2 = minValue * maxarea[1];

		}
		if (h == 2) {
			t = maxarea[2];
			value2 = minValue * maxarea[2];
		}

		int sum = 0;

		for (int i = 0; i < cost.length; i++) {
			sum = sum + cost[i];
		}

		int add = maxValue + minValue;
		int midvalue = sum - add;
		int u = s + t;

		int midarea = total - u;

		value3 = midarea * midvalue;

		int answer = value1 + value2 + value3;

		System.out.println("answer::"+answer);
		sc.close();

	}
}
