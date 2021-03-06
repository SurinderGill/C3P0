package experts;

import java.util.ArrayList;

import main.Beer;

public class OriginExpert implements Expert {
	
	public OriginExpert() {}

	@Override
	public ArrayList<Beer> decision(String input, ArrayList<Beer> beers) {
		ArrayList<Beer> results = new ArrayList<Beer>();
		for (Beer b : beers) {
			if (b.origin().equals(input)) {
				results.add(b);
			}
		}
		return results;
	}
	
	public String toString() {
		return "I am the Origin Expert.";
	}
}
