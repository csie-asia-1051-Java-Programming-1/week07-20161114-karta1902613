package hw;

import java.util.Scanner;

public class hw04 {
	/*
	 * Date: 2016/11/14
	 * �g�@���j��ơA�D m�Bn ��ƪ��̤j���]�� gcd(m,n)����L��J
	 * Author: 105021043 �B�ͤ�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int m=scn.nextInt();
		int n=scn.nextInt();
		System.out.print(gcd(m,n));
	}
    public static int gcd(int m,int n){
    if(n==0)
    	return m;
    else
    	return gcd(n,m%n);
    }
    
}
