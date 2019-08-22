package _02_More_Algorithms;

import java.util.List;

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
}
