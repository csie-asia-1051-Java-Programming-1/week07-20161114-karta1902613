package hw;

import java.util.Scanner;

public class hw02 {
	/*
	 * Date: 2016/11/14
	 * �H���j�]�p��ơA��J�@�ӥ���ƭ�(���t 0)�A�Ǧ^�ӼƭȬO�X���(# ofdigits)�C
	 * Author: 105021043 �B�ͤ�
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