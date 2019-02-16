import java.util.*;
import java.util.Scanner;

public class SortArrayOfStringByAlphabeticDefinedByAnotherString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		String str,ch = null;
		String arrStr[] = new String[5000];
		TreeMap<Integer, String> h = new TreeMap<>();
		str=sc.nextLine();
		boolean b=true;
		int i=0,j;
	
		while(b) {
			arrStr[i]=sc.nextLine();
			i++;
			System.out.println("Press y for continue");
			ch=sc.nextLine();
		}if(!(ch.equalsIgnoreCase("y"))) {b=false;}	
		ch=null;
		i=0;
		Character c=new Character(' ');
		while(i<arrStr.length) {
			ch =arrStr[i];
			c=ch.charAt(0);
			String s = c.toString();
			j=str.indexOf(s);
			//j=str.indexOf((ch.charAt(0).toString());
			h.put(j, ch);
			i++;
		}
		
		for(Map.Entry m:h.entrySet() ) {
			System.out.print(m.getValue()+"");
		}
	}

}
