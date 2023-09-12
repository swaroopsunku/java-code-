package array1;

public class A1 {
	public static void main(String[] args) {
		int a[]= {1,2,5};
		int amount=18;
		int x=amount/a[2];
		amount-=x*a[2];
		int y=amount/a[1];
		amount-=y*a[1];
		int z=amount/a[0];
		System.out.println(x+y+z);
		
	}
}
