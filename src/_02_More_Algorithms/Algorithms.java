package _02_More_Algorithms;

import java.util.Collections;
import java.util.List;

import _00_Sorting_Algorithms.Sorter;
import _00_Sorting_Algorithms.SortingVisualizer;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for(int i=0; i<eggs.size(); i++) {
			if(eggs.get(i)=="cracked") {
				return i;
			}
			
		}
		return 0;
	}
	public static int countPearls(List<Boolean> oysters) {
		int num=0;
		for(int i=0; i<oysters.size(); i++) {
			if(oysters.get(i)==true) {
				num+=1;
			}
		}
		return num;
	}
	public static double findTallest(List<Double> peeps) {
		double tallest=0;
		for(int i=0; i<peeps.size(); i++) {
			if(peeps.get(i)>tallest) {
				tallest=peeps.get(i);
			}
		}
		return tallest;
	}
	public static String findLongestWord(List<String> words) {
		String len="b";
		for(int i=0; i<words.size();i++) {
			if(words.get(i).length()>len.length()) {
				len=words.get(i);
			}
		}
		return len;
	}
	public static boolean containsSOS(List<String> m) {
			if(m.contains(" ... --- ... ")) {
				return true;
			}
			return false;
	}
	public static List<Double> sortScores(List<Double> results) {
		Collections.sort(results);
		return results;
			
				
			
			
//			// Insertion Sort is similar to Bubble Sort but a little more efficient
//			//  You can use display.updateDisplay() to show the current
//			//   progress on the graph.
//			
//					
//				//1. make a for loop that starts at 1 and goes through 
//				// the length of the array 
//				for (int i = 1; i < results.size(); i++) {
//					
//				
//					//2. make another for loop that starts at i and counts down
//		        	//   while j is greater than 0
//					for (int j = i; j > 0; j--) {
//						
//					
//						//3. if the element at j is less than the element at j - 1,
//		            	//   then swap them
//						if (results.get(j)<results.get(j-1)) {
//							int temp = results[j];
//							array[j]= array[j-1];
//							array[j-1] = temp;
//							display.updateDisplay();
//						}
//					}
//				}
//				display.updateDisplay();
//			}
//		}
		
		
	}
}
