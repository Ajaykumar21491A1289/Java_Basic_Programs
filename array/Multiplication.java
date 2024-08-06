package array;
import java.util.Scanner;
public class Multiplication {

	public static void main(String[] args) {
		int row1,column1,row2,column2,i,j,k;
		Scanner s=new Scanner(System.in);
		System.out.println("enter row and column of array 1: ");
		row1=s.nextInt();
		column1=s.nextInt();
		Scanner s1=new Scanner(System.in);
		System.out.println("enter row and column of an array 2");
		row2=s1.nextInt();
		column2=s1.nextInt();
		int ary[][]=new int[row1][column1];
		int ary2[][]=new int[row2][column2];
		int ary3[][]=new int[20][20];
		System.out.println("enter " +(row1*column1)+" elements in array1: ");
		for(i=0;i<row1;i++)
		{
		    for(j=0;j<column1;j++)
		    {
		        ary[i][j]=s.nextInt();
		        }
		}
		System.out.println("enter "+(row2*column2)+" elements in array 2: ");
		for(i=0;i<row2;i++){
		    for(j=0;j<column2;j++){
		        ary2[i][j]=s1.nextInt();
		    }
		}
		System.out.println("1st array elements are: ");
		for(i=0;i<row1;i++)
		{
		    for(j=0;j<column1;j++){
		         System.out.print(ary[i][j]+" ");
		    }
		    System.out.println();
		}
		System.out.println("2nd array elements are: ");
		for(i=0;i<row2;i++)
		{
		    for(j=0;j<column2;j++){
		         System.out.print(ary2[i][j]+" ");
		    }
		    System.out.println();
		}
		System.out.println("MULTIPLICATION OF TWO MATRIX");
		if(column1==row2){
		for(i=0;i<row1;i++)
		{
		    for(j=0;j<column2;j++){
		        ary3[i][j]=0;
		        for(k=0;k<row2;k++){
		            ary3[i][j]+=ary[i][k]*ary2[k][j];
		        }
		       
		    }
		    
		}
		}
		System.out.println("the array elements after MULTIPLICATION");
		for(i=0;i<row2;i++)
		{
		    for(j=0;j<column1;j++){
		         System.out.print(ary3[i][j]+" ");
		    }
		    System.out.println();
		}
		}
		}

