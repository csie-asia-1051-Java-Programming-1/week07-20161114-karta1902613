package ex;
/*
 * Date: 2016/11/14
 * ���ϥΪ̿�J�@�ӥ���� n�A���ۨϥλ��j�I�s�L�X n! �����G�C
 * Author: 105021043 �B�ͤ�
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

