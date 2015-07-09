package evm;

import java.util.ArrayList;

public class Adapter implements ControlUnit{
	
	ArrayList <Candidate> candidates = new ArrayList<Candidate>();
	
	Candidate cd1 = new Candidate("Raj",1,0);
	Candidate cd2 = new Candidate("Vir",2,0);
	Candidate cd3 = new Candidate("Karan",3,0);
	
	@Override
	public int ballotbutton() {
		// TODO Auto-generated method stub
		System.out.println("Ballot Button is Pressed");
		return 0;
	}
	
	public int addcandidate(){
		candidates.add(cd1);
		candidates.add(cd2);
		candidates.add(cd3);
		System.out.println("Candidates Added Successfully\n");
		return 0;
	}
}
