package ex;
/*
 * Date: 2016/11/14
 * �мg�@�ӵ{���A�ΰ}�C�x�s�ϥΪ̿�J�� n �Ӿ�ơA�z�L�禡 var() �i�H�^�ǭp��Ӱ}�C�̪��Ʀr���ܲ��ƫ�A�C�L�X���G�C
 * Author: 105021043 �B�ͤ�
 */
import java.util.*;
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
      	int n=scn.nextInt();	
      	 int []data=new int[n];
      	 for(int i=0;i<n;i++){
          	int x =scn.nextInt();
          	data[i]=x;}
		System.out.println(var(data, n));}
	
    public static int var(int data[] , int n){
    	Scanner scn=new Scanner(System.in);          
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
         return (int) ans;}}