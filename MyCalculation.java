import java.util.Scanner;

public class MyCalculation extends Calculation{

	public MyCalculation() {
		// TODO Auto-generated constructor stub
	}
	public static void multiplication(int x,int y) {
		z=x*y;
		System.out.println(z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc= new Scanner(System.in);
      System.out.println("Give the values of two numbers:");
      int a = sc.nextInt();
      int b = sc.nextInt();
      sc.close();
      //MyCalculation demo = new MyCalculation();
      MyCalculation.addition(a, b);
      MyCalculation.substraction(a, b);
      MyCalculation.multiplication(a, b);
	}

}
