package q6_1;

import java.util.Scanner;

public class MethodEx {
	public void abs(int num1, int num2) {
		if (num1 > num2) {
			System.out.println(num1 - num2);
		} else {
			System.out.println(num2 - num1);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		MethodEx m = new MethodEx();
		m.abs(num1, num2);
	}
}
