package com.abh.prime.number;

import java.util.Scanner;

interface AdvancedArithmetic {
	int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {
	public int divisorSum(int n) {
		if (n == 1) {
			return n;
		}
		int result = 0;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				if (i == (n / i))
					result += i;
				else
					result += (i + n / i);
			}
		}
		return result + 1 + n;
	}
}

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scan.nextInt();
			if (n == 1) {
				System.out.println("Not prime");
				continue;
			}
			Calculator c = new Calculator();
			int sum = c.divisorSum(n);
			if (sum - 1 == n) {
				System.out.println("Prime");
			} else {
				System.out.println("Not prime");
			}
		}
		scan.close();
	}

}
