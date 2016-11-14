package ex;

import java.util.*;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner scn = new Scanner(System.in);
			int x=scn.nextInt();
			int y=scn.nextInt();
			int[][] data = new int[y][x];
			for(int i=0;i<y;i++){
				for(int j=0;j<x;j++){
					data[i][j]=scn.nextInt();}}	
			System.out.print(var2(data,x,y)+"\n"+std2(var2(data,x,y)));}
	public static float var2(int data[][],int x,int y) {
	int sum=0;
	int ps=0;
	int xy=x*y;
		for(int i=0;i<y;i++){
			for(int j=0;j<x;j++){
				sum+=data[i][j];}}
		sum=(int) ((float)sum/xy);
		for(int i=0;i<y;i++){
			for(int j=0;j<x;j++){
				ps+=Math.pow(data[i][j]-sum,2);
			}}
		return ((float)ps/xy);}
   
	public static float std2(float xy) {
	float std = 0;
	std =(float)Math.sqrt(xy);
	return std;}}
