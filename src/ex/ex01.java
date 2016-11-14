package ex;
/*
 * Date: 2016/11/14
 * Author: 1050210XX OOO
 */
import java.util.*;
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
      		var(scn.nextInt());}
	
    public static float var(int n){
    	Scanner scn=new Scanner(System.in);
         int []data=new int[n];
     for(int i=0;i<n;i++){
         	int x =scn.nextInt();
         	data[i]=x;}
         int us =0;
     	 int sum=0;
     for(int i=0;i<n;i++){
    	 us+=data[i];}
	 float u=us/n;
     for(int i=0;i<n;i++){
    	 data[i]=(int) ((data[i]-u)*(data[i]-u));}
     for(int i=0;i<n;i++){
    	 sum+=data[i];}
         float ans=0;
     ans=(float)sum/n;
     System.out.print((float)ans);
         return ans;}}