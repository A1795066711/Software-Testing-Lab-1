package Lab1;

import java.util.ArrayList;
import java.util.List;

public class TriangleProblem {
	
	int[] bills = { 50, 20, 5, 5, 1, 1, 1 };
	List <Integer> choice = new ArrayList <Integer> ();
	List <Integer> result = new ArrayList <Integer> ();
	int count = 7;
	
	public void initialization() {
		count--;
		for( int i = 0; i < 7; i++ ) {
		choice.add(i);
		recursion(i);
		}
	}
	
	public void recursion( int i ) {
		Integer r = 0;
		for( Integer e : choice )
			r = r + bills[e];
		result.add(r);
		if( count == 0 ) {
			choice.clear();
			return;
		}
		count--;
		for( int j = 0; j < 7; j++ ) {
			if( choice.contains(j) )
				continue;
			choice.add(j);
			recursion(j);
		}
	}
}
