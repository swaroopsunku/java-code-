package arrays;
import java.util.*;
public class P5 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the size of an array :");
		int size=scan.nextInt();
		int[] a=new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter the "+(i+1)+" element :");
			a[i]=scan.nextInt();
		}
		int sum=0;
		for(int j:a) {
			sum+=j;
		}
		int avg=sum/size;
		System.out.println("The average of an array is :"+avg);
	}
}
