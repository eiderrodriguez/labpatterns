package adapter;

import java.util.Comparator;

import domain.Symptom;

public class SymptomComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String sy1 = ((Symptom) o1).getName();
		String sy2 = ((Symptom) o2).getName();
		
		return sy1.compareTo(sy2);
	}
}