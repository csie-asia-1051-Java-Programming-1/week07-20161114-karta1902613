package hw;

import java.util.Scanner;

public class hw02 {
	/*
	 * Date: 2016/11/14
	 * 以遞迴設計函數，輸入一個正整數值(不含 0)，傳回該數值是幾位數(# ofdigits)。
	 * Author: 105021043 劉凱文
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner scn = new Scanner(System.in);
				int n=scn.nextInt();
				System.out.print(fun(n));
	}
	public static int fun(int n) {
		int i=0;
		if(n==0){
			i=1;
			return 0;
		}else{
			n=n/10;
			return 	fun(n)+1;
				}
		}
}