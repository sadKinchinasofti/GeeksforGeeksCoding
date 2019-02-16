import java.util.*;

public class MinimumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		//int a[] = new int[500];
		ArrayList<Integer> a = new ArrayList<>();
		int length = sc.nextInt();
		int i=0;
		while(i<length) {
			a.add(sc.nextInt());
			i++;
		}
		i=0;
		while(i<length) {
			System.out.println(a.get(i));
			i++;
		}
		int smallest = 9999999;
        i=0;
        while(i<length) {
        	if(i<smallest) {
        		smallest = i;
        	}
        }
        System.out.println(smallest);
	}
}
