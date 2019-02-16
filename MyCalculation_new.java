import java.util.Scanner;

public class MyCalculation_new extends Calculation_new{
	public void multiplication(int x,int y) {
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
      //MyCalculation.addition(a, b);
      //MyCalculation.substraction(a, b);
      //MyCalculation.multiplication(a, b);
      Calculation_new demo = new MyCalculation_new();
      demo.addition(a, b);
      demo.substraction(a, b);
      //demo.multiplication(a,b);
	}
}
