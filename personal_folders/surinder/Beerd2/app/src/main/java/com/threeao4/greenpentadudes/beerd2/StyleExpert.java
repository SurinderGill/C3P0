package com.threeao4.greenpentadudes.beerd2;

import com.threeao4.greenpentadudes.beerd2.Beer;
import com.threeao4.greenpentadudes.beerd2.Expert;

import java.util.ArrayList;


public class StyleExpert implements Expert {

	public StyleExpert() {}

	@Override
	public ArrayList<Beer> decision(String input, ArrayList<Beer> beers) {
		ArrayList<Beer> results = new ArrayList<Beer>();
		for (Beer b : beers) {
			if (b.style().equals(input)) {
				results.add(b);
			}
		}
		return results;
	}
	
	public String toString() {
		return "I am the Style Expert.";
	}
}
