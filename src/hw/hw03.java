package hw;

import java.util.Scanner;

public class hw03 {
	/*
	 * Date: 2016/11/14
	 * ��J��Ӿ�ơA�ϥλ��j��ƩI�s��X C(m,n)�C
	 * Author: 105021043 �B�ͤ�
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
