package ex;

import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);	 	
		int n=scn.nextInt();
		System.out.println(std(var(n)));}
		
    public static float var(int n){
	Scanner scn=new Scanner(System.in);
	int []data=new int[n];
     for(int i=0;i<n;i++){
    	 data[i] =scn.nextInt();}
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
      return ans;}
        
    public static float std(float ans){
		float la=(float) Math.sqrt(ans);
		return la;}}

