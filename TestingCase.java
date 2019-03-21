package Lab1;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class TestingCase {

	@Test
	public void test() {
		TriangleProblem testCase = new TriangleProblem();
		testCase.initialization();
		Integer [] tUnits = { 1 , 20 , 30 , 40 , 50 , 60 , 70 , 80 , 90 , 100 };
		for( int i = 0 ; i < tUnits.length ; i++ ) {
			if( ( testCase.result ).contains( tUnits[i] ) )
				System.out.println( "Yes, you can." );
			else
				System.out.println( "No, you can't." );
		}
	}

}
