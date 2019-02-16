import java.util.*;
public class MaximumSumOfTwoArrays {
	//This problem is to find the maximum values from each array and then summation of these values

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[50];
		int[] array1 = new int[50];
		int i=0,n,x,y,j=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of elements in array:");
		n=sc.nextInt();
		while(i<n) {
			System.out.println("enter elements in array:");
			array[i]=sc.nextInt();
			System.out.println("enter elements in array1:");
			array1[i]=sc.nextInt();
			i++;
		}
		i=0;
		System.out.println(array);
		System.out.println(array1);
		System.out.println("number of elements to choose from each array");
		x=sc.nextInt();
		y=sc.nextInt();
		int array3[] = new int[x+y];
		int smallest = -9999999, largest = 9999999;
		int length = array.length;
		int length1 = array1.length;
		while(j<x){
			System.out.println("Enter into outer loop");
			while(i<length){
				System.out.println("Enter into region of getting smallest and largest");
			    if(array[i]>smallest && array[i]<largest){
			        smallest = array[i];
			    }
			    i++;
			}
			System.out.println("Enter into region where we will insert into new array");
			System.out.println("largest:");
			//if(i==length) {
				largest = smallest;
			////}else {
		//	largest = array[i];
			}
			array3[j] = largest;
			System.out.println(array3[j]);
			j++;
			i=0;
			smallest = -9999999;
			}
		//i=0;
		//while(i<=j) {
		//System.out.println(array3[i]);
		//i++;
		//}
	}


