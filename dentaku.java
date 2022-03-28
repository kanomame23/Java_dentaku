package sample;

import java.util.Scanner;

public class JavaSampleClass {
	public static void main(String[] args) {
		int ans = 0;
		System.out.println("電動卓上計算機");
		System.out.println("数字を入力してください");
		int num1 = new Scanner(System.in).nextInt();
		System.out.println("記号入力してください + - * /");
		String s = new Scanner(System.in).nextLine();
		System.out.println("入力してください");
		int num2 = new Scanner(System.in).nextInt();
		switch(s) {
		case "+":
			ans = num1 + num2;
			break;
		case "-":
			ans = num1 - num2;
			break;
		case "*":
			ans = num1 * num2;
			break;
		case "/":
			ans = num1 / num2;
			break;
			default:
				System.out.println("そんな式はありませーん");
		}
		
		System.out.println("答えは。。。");
		System.out.println(ans);
		
	}
}