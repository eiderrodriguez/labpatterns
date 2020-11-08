package adapter;

import java.util.ArrayList;
import java.util.Iterator;

import domain.Covid19Pacient;
import domain.Symptom;

public class Main {

	public static void main(String[] args) {
		Covid19Pacient p = new Covid19Pacient("aitor", 35);
		p.addSymptom(new Symptom("mareos", 1, 5), 1);
		p.addSymptom(new Symptom("vomitos", 2, 6), 2);
		p.addSymptom(new Symptom("fiebre", 3, 7), 3);
		p.addSymptom(new Symptom("nauseas", 4, 8), 4);
		p.addSymptom(new Symptom("escalofrios", 5, 9), 5);
		
		
		Covid19PacientInvertedIterator inIter = new Covid19PacientInvertedIterator(new ArrayList<Symptom>(p.getSymptoms()));
		SymptomComparator sComp = new SymptomComparator();
		SeverityComparator iComp = new SeverityComparator();
		
		Iterator iName = Sorting.sortedIterator(inIter, sComp);
		Iterator iIndex = Sorting.sortedIterator(inIter, iComp);
		
		System.out.println("Sintomaren izenaren arabera: ");
		while(iName.hasNext()) {
			System.out.println(iName.next());
		}
		
		System.out.println("Severity index arabera: ");
		while(iIndex.hasNext()) {
			System.out.println(iIndex.next());
		}
	}

}
