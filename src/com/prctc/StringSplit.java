package com.prctc;

import java.util.Arrays;

public class StringSplit {

	public static void main(String[] args) {
		{
	        String str = "geekss@for@geekss";
	        String [] arrOfStr = str.split("e", 4);
	 
	        for (String a : arrOfStr)
	            System.out.println(a);
	    }
	}
}

