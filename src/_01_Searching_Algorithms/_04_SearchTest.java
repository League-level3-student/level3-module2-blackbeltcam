package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] iq1= {"wow", "cool", "amazing"};
		assertEquals(1, _00_LinearSearch.linearSearch(iq1, "cool"));
		assertEquals(-1, _00_LinearSearch.linearSearch(iq1, "happy"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] iq2= {4,32 ,45, 57, 536};
		assertEquals(4, _01_BinarySearch.binarySearch(iq2, 0, 4, 536));
	    assertEquals(-1, _01_BinarySearch.binarySearch(iq2, 0, 4, 5));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] iq3= {3, 6, 9, 12, 15};
		assertEquals(-1, _02_InterpolationSearch.interpolationSearch(iq3, 10));
		assertEquals(1, _02_InterpolationSearch.interpolationSearch(iq3, 6));
	}

	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] iq4= {4,32 ,45, 57, 536};
		assertEquals(2, _03_ExponentialSearch.exponentialSearch(iq4, 45));
	    assertEquals(-1, _03_ExponentialSearch.exponentialSearch(iq4, 94));
	}
}
