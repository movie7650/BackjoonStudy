package backjoonstudy;

import java.util.Scanner;

public class bj11021 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for(int i=1; i<=t; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = a+b;
			System.out.println("Case #"+ i +":" + " " + c);
		}
		scanner.close();
	}

}
