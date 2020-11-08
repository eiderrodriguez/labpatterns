package adapter;

import java.util.Comparator;
import domain.Symptom;

public class SeverityComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer s1 = ((Symptom) o1).getSeverityIndex();
		Integer s2 = ((Symptom) o2).getSeverityIndex();
		
		if(s1>s2)
			return 1;
		else if(s1<s2)
			return -1;
		else
			return 0;
	}
}
