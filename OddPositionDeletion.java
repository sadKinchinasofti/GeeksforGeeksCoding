import java.util.*;
public class OddPositionDeletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This problem is to delete the odd pos elements from array until array has only 1 element.

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>();
		ArrayList<Integer> array1 = new ArrayList<Integer>();
		int i=0,n,a,length,j=0;
		System.out.println("Number of elements");
		n=sc.nextInt();
		while(i<n) {
			System.out.println("Insert elements into array:");
			a=sc.nextInt();
			array.add(a);
			i++;
		}
		System.out.println("array before deletion"+array);
		length=array.size();
		System.out.println("length of the array"+length);
		while(length!=1) {
			System.out.println("Entered into the loop of length");
			while(j<length) {
				System.out.println("Entered inner loop");
				if(j%2!=0) {
					System.out.println("Entered inner inner loop");
					array1.add(array.get(j));
					//array.removeIf(j -> (j%2==0));
					System.out.println(array1);
				}
				j++;
			}
			j=0;
			array.removeAll(array1);
			length=array.size();
			System.out.println(array);
			System.out.println(length);
		}
		
		System.out.println("array after deletion"+array);
		//int array[] = new int[50];
		//int array1[] = new int[50];
		//int i=0,length,j=0,z=0;
		//length=sc.nextInt();
		//while(i<length) {
			//array[i] = sc.nextInt();
			//i++;
		//}
		//System.out.println(array);
		//while(length!=1) {
			//while(j<length) {
				//if(j%2 != 0) {
					//System.arraycopy(array, j+1, array, length-1, length-1);//arraycopy method is used to create copy of array
				//}else {
					//array1[z] = array[j];
					//z++;
				//}
				//j++;
			//}
			//length--;
		//}
		//System.out.println(array1);
	}

}
