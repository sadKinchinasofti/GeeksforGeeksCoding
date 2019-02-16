
public class Calculation {
	static int z;
	public static void addition(int x,int y) {
		z=x+y;
		System.out.println(z);
	}
	public static void substraction(int x,int y) {
		if(x>y)
			z=x-y;
		else
			z=y-x;
		System.out.println(z);
	}

}
