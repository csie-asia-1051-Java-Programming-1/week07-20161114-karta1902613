package hw;

import java.util.Scanner;

public class hw03 {
	/*
	 * Date: 2016/11/14
	 * 輸入兩個整數，使用遞迴函數呼叫輸出 C(m,n)。
	 * Author: 105021043 劉凱文
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int m=scn.nextInt();
		int n=scn.nextInt();
		System.out.print(C(m)/(C(n)*C(m-n)));
	}
	public static int C(int x){
		if(x==1)
			return 1;
		else
			return x*C(x-1);
	}
}
