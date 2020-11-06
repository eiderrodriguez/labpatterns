package observer;

import java.util.Observable;

import domain.Covid19Pacient;

public class Main {

	public static void main(String args[]){
		Observable pacient = new Covid19Pacient("Aitor", 35); 
		PacientObserverGUI pacientGUI = new PacientObserverGUI (pacient); 
		PacientSymptomGUI frame = new PacientSymptomGUI (pacient);
		PacientThermometerGUI thermo = new PacientThermometerGUI(pacient);
		SemaphorGUI sem = new SemaphorGUI(pacient);
		/*
		Observable pacient2 = new Covid19Pacient("Garazi", 99); 
		PacientObserverGUI pacientGUI2 = new PacientObserverGUI (pacient2); 
		PacientSymptomGUI frame2 = new PacientSymptomGUI (pacient2);
		PacientThermometerGUI thermo2 = new PacientThermometerGUI(pacient2);
		
		Observable pacient3 = new Covid19Pacient("Eider", 22); 
		PacientObserverGUI pacientGUI3 = new PacientObserverGUI (pacient3); 
		PacientSymptomGUI frame3 = new PacientSymptomGUI (pacient3);
		PacientThermometerGUI thermo3 = new PacientThermometerGUI(pacient3);
		*/
	}

}
