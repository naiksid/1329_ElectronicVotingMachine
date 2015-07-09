package evm;

public class Candidate {
	
	String Name;
	int candidateID;
	int myVotersCount;
	
	public Candidate(String name, int candidateID, int myVotersCount) {
		super();
		Name = name;
		this.candidateID = candidateID;
		this.myVotersCount = 0;
	}
	
}
