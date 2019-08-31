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
			
				
		
		
	}
	public static List<String> sortDNA (List<String> unsortedSeqeunces) {
		System.out.println(unsortedSeqeunces);
		
		int n = unsortedSeqeunces.size();
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (unsortedSeqeunces.get(j).length() > unsortedSeqeunces.get(j+1).length()) {
					String temp = unsortedSeqeunces.get(j);
					unsortedSeqeunces.set(j, unsortedSeqeunces.get(j+1)) ;
					unsortedSeqeunces.set(j+1, temp);
					
				}
			}
		}
	
		System.out.println(unsortedSeqeunces);
		return unsortedSeqeunces;
		

	}
	//LIST<STRING>
	public static void sortWords (List<String> words){
		for(int i=0; i<words.size(); i++) {
			int blah=words.get(i).compareTo(words.get(i+1));
		}
	}
	}

