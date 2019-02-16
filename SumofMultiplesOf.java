import java.util.*;
public class SumofMultiplesOf {
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<>();
		int a,b,N,c=0,d=0,i=1;
		N=sc.nextInt();
		a=sc.nextInt();
		b=sc.nextInt();
		while(c<=N || d<=N) {
			if(c<=N) {
				c=a*i;
				c<N?array.add(c):null;
				System.out.println("for a:"+array);
			}
			if(d<=N) {
				d=b*i;
				//array.add(d);
				d<N?array.add(d):null;
				System.out.println("for b:"+array);
			}
			i++;
		}
		System.out.println("print all:"+array);
	}
}
