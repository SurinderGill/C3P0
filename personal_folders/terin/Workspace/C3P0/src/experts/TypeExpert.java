package experts;

import java.util.ArrayList;

import main.Beer;

public class TypeExpert implements Expert {
	
	public TypeExpert() {}

	@Override
	public ArrayList<Beer> decision(String input, ArrayList<Beer> beers) {
		ArrayList<Beer> results = new ArrayList<Beer>();
		for (Beer b : beers) {
			if (b.type().equals(input)) {
				results.add(b);
			}
		}
		return results;
	}
	
	public String toString() {
		return "I am the Type Expert.";
	}
}
