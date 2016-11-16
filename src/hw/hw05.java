package hw;

import java.util.Scanner;

public class hw05 {
	/*
	 * Date: 2016/11/14
	 * 寫一遞迴函數，讓使用者輸入一個長整數，透過遞迴函數運算後得到反向的數字字串並印出。例如:輸入 1234 回傳 4321
	 * Author: 105021043 劉凱文
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int i=0;
		System.out.print(fun(n,i));
	}
    public static int fun(int n,int i){
   
      if(n==0)
    	return i;
      else
    	i=i*10;
       	return fun(n/10,i+n%10);
        }
    }
