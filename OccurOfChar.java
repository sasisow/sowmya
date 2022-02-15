package com.devlabs.assignment2;

public class OccurOfChar {

	 public static void main(String argu[]) {

	  String str = "BROADRIDGE FINACIAL";
	  int cnt = 0;
	  char[] inp = str.toCharArray();
	  System.out.println("Duplicate Characters in the given strings are:");
	  for (int i = 0; i < str.length(); i++) {
      
	   for (int j = i + 1; j < str.length(); j++) {
       
	    if (inp[i] == inp[j]) {
        
	     System.out.println(inp[j]);
	     cnt++;
	     break;
	    }
	   }
	  }
	 }
	}
