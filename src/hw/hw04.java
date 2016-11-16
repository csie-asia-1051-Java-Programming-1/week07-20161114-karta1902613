package hw;

import java.util.Scanner;

public class hw04 {
	/*
	 * Date: 2016/11/14
	 * 糶患癹ㄧ计― mn ㄢ计程そ计 gcd(m,n)パ龄絃块
	 * Author: 105021043 糂惩ゅ
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
