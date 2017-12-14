package probome;

public class Number_4 {
	public static void main(String[] args) {
		doubleArray();
	}
	public static void doubleArray () {
		
		int a[]= {3,4,5};
		int x=a[0];
		int y=a[1];
		int z=a[2];
		int b[]= {x, y, z, x, y, z};
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);

	}
}
}