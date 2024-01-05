package main1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Day20FindBinarySearchProgram {
	public static void main(String[] args) {
		
		Integer a[]= {21,3,61,71,8};
		
		List<Integer>list=Arrays.asList(a);
		Collections.sort(list);
		System.out.println(list);
		
		
		int position=Collections.binarySearch(list, 32);
		System.out.println(position);
	}

}
