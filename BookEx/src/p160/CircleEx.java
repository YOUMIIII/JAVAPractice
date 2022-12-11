package p160;

import java.util.Scanner;

public class CircleEx {
	public double area(int r) {
		return r * r * 3.14;
	}

	public double per(int r) {
		return 2 * r * 3.14;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		sc.close();
		
		CircleEx c = new CircleEx();
		System.out.println("원의 넓이 : " + c.area(r));
		System.out.println("원의 둘레 : " + c.per(r));
	}
}
