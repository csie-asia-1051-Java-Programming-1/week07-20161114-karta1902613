package ex;
/*
 * Date: 2016/11/14
 * 請寫一個程式，讓使用者輸入一個整數二維陣列，建立 var2()函式 及std2()可以分別計算二維陣列的變異數與標準差，並把結果回傳到主程式印出。
 * Author: 105021043 劉凱文
 */
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
