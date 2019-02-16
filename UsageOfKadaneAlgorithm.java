import java.util.*;
public class UsageOfKadaneAlgorithm {

	//this algorithm is to find the maximum sum of elements in an array
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int array[] = new int[500];
		int i=0,Sum=0,requiredSum;
		int n=sc.nextInt();
		while(i<n) {
			array[i] = sc.nextInt();
			i++;
		}
		int max_so_far=0,max_ending_here=0;
		i=0;
		while(i<n) {
			Sum += array[i];
			max_ending_here = max_ending_here + array[i];
			if(max_ending_here < 0) {
				max_ending_here = 0;
			}else {
				if(max_ending_here >max_so_far) {
					max_so_far = max_ending_here;
				}
			}
			i++;
		}
		requiredSum = 2*Sum - max_so_far;
		System.out.println(requiredSum);
	}

}
