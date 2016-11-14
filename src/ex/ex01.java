package ex;
/*
 * Date: 2016/11/14
 * 請寫一個程式，用陣列儲存使用者輸入的 n 個整數，透過函式 var() 可以回傳計算該陣列裡的數字的變異數後再列印出結果。
 * Author: 105021043 劉凱文
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