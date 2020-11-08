package adapter;


import java.util.ArrayList;
import java.util.List;

import domain.Symptom;

public class Covid19PacientInvertedIterator implements InvertedIterator{

	private ArrayList<Symptom> symptoms;
	private int pos;
	
	
	
	public Covid19PacientInvertedIterator(ArrayList<Symptom> symptoms) {
		super();
		this.symptoms = symptoms;
		this.pos = symptoms.size()-1;
	}

	@Override
	public Object previous() {
		Symptom aur = symptoms.get(pos);
		pos = pos - 1;
		return aur;
	}

	@Override
	public boolean hasPrevious() {
		return (pos>=0);
	}

	@Override
	public void goLast() {
		pos = symptoms.size()-1;
	}

}
