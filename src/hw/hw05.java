package hw;

import java.util.Scanner;

public class hw05 {
	/*
	 * Date: 2016/11/14
	 * �g�@���j��ơA���ϥΪ̿�J�@�Ӫ���ơA�z�L���j��ƹB���o��ϦV���Ʀr�r��æL�X�C�Ҧp:��J 1234 �^�� 4321
	 * Author: 105021043 �B�ͤ�
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
