package ex;
/*
 * Date: 2016/11/14
 * 讓使用者輸入一個正整數 n，接著使用遞迴呼叫印出 n! 的結果。
 * Author: 105021043 劉凱文
 */
import java.util.Scanner;
	
public class ex04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scn = new Scanner(System.in);
			int n=scn.nextInt();
	        System.out.print(fun(n));}
	
	public static int fun(int n){
		    if(n==1){
			    return n;
		    }else{					
			    return n*fun(n-1);}}}

