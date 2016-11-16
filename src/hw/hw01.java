package hw;

import java.util.Scanner;

/*
 * Date: 2016/11/14
 * 叫糶ㄧ计 lcm(x,y,z)―计 xyz ぇ程そ计
 * Author: 105021043 糂惩ゅ
 */
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x=scn.nextInt();
		int y=scn.nextInt();
		int z=scn.nextInt();
		System.out.print(lcm(x,y,z));}
	
		public static int lcm(int x,int y,int z){
			int	xyz=x*y*z;
	        int i=1;
         for(i=2;i<xyz;i++)
               if(i%x!=0||i%y!=0||i%z!=0)
    		  continue;
    	  else if(i%x==0&&i%y==0&&i%z==0)
	          break;         
	         
         return i;
             }
		}