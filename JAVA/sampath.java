import java.util.*;
import java.io.*;

public class sampath {
	public void Digits(int n,int m,int o){
		int largestn = 0;
		int smallestn = 9;
		int largestm = 0;
		int smallestm = 9;
		int largesto = 0;
		int smallesto = 9;
		while(n != 0)
		{
			int r = n % 10;
	        int s = m%10;
	        int t = o%10;
			largestn = Math.max(r, largestn);
			smallestn = Math.min(r, smallestn);
	        largestm = Math.max(s, largestm);
			smallestm = Math.min(s, smallestm);
			largesto = Math.max(t, largesto);
			smallesto = Math.min(t, smallesto);
			n = n / 10;
			m=m/10;
			o=o/10;
		}
		System.out.println((largestn+largestm+largesto) +(smallestn+smallestm+smallesto));
//		return ((largestn+largestm+largesto) -(smallestn+smallestm+smallesto));
	}
	public static void main(String[] args) {
		Digits(3521,2452,1352);
		
	}

}
