package jp.co.aforce.test;

public class MinMax {
	int getMaxValue(int a, int b, int c) {
		if(a >= b && a >= c) {
			return a;
		}else if(b >= a && b >= c) {
			return b;
		}else {
			return c;
		}
	}

	int getMinValue(int a, int b, int c) {
		if(a <= b && a <= c) {
			return a;
		}else if(b <= a && b <= c) {
			return b;
		}else {
			return c;
		}
	}

}
