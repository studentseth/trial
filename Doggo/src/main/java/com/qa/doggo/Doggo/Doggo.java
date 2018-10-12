package com.qa.doggo.Doggo;

import java.util.ArrayList;
import java.util.List;

public class Doggo {

	private final String[] suffix = { "", "st", "nd", "rd", "th" };
	private final int[] tens = { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90 };
	private final int[] fifths = { 5, 15, 25, 35, 45, 55, 65, 75, 85, 95 };

	public String printposition(String position) {
//		List <String> numbersList = new ArrayList<String>(); whats going on?!!
		
		for (int i = 1; i <= 100; i++) {
			if (i < 4) {
				System.out.println(i + suffix[i]);
			} else if (i > tens[2] && i < fifths[2]) {
				System.out.println(i + suffix[i % 20]);
			} else if (i > tens[3] && i < fifths[3]) {
				System.out.println(i + suffix[i % 30]);
			}
		else if (i > tens[4] && i < fifths[4]) {
			System.out.println(i + suffix[i % 40]);
		}
		else if (i > tens[5] && i < fifths[5]) {
			System.out.println(i + suffix[i % 50]);
		}
		else if (i > tens[6] && i < fifths[6]) {
			System.out.println(i + suffix[i % 60]);
		}
		else if (i > tens[7] && i < fifths[7]) {
			System.out.println(i + suffix[i % 70]);
		}
		else if (i > tens[8] && i < fifths[8]) {
			System.out.println(i + suffix[i % 80]);
		}
		else if (i > tens[9] && i < fifths[9]) {
			System.out.println(i + suffix[i % 90]);
		}
			else {

				System.out.println(i + suffix[4]);
			}
			
		}

		return "position";

	}

}
