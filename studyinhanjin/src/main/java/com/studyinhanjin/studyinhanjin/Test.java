package com.studyinhanjin.studyinhanjin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		int[] forArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		List<String> list 					= new ArrayList<>();
		HashMap<Integer, List<String>> map 	= new HashMap<>();
		
		System.out.println(map.toString());
		
		for(int key : forArr) {
			list.add(String.valueOf(key));
			
			System.out.println("key = " + key);
			System.out.println("list = " + list.toString());
			
			map.put(key, list);
			
		}//end for()
		
		System.out.println(map.toString());
		
		System.out.println("===============================");
		for(int key : map.keySet()) {
			System.out.println(key + " / " + map.get(key));
		}
		
	}//end main()
}//end class()
