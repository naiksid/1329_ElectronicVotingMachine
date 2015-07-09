package evm;

import java.util.Scanner;

public class BallotingUnit {

	int totalpoll=0;
	
	public int machineready(){
		System.out.println("Machine is ready");
		return 0;
	}

	
	public String castVote(){
		Scanner s = new Scanner(System.in);
		System.out.println("Select the appropriate button to cast the vote\n");
		System.out.println("Enter 1-Candidate One");
		System.out.println("Enter 2-Candidate Two");
		System.out.println("Enter 3-Candidate Three");
		int selectedCandidate = s.nextInt();
		totalpoll=totalpoll+1;
		return "true";
	}


	public void sendoutput(ControlUnit cu) {
		// TODO Auto-generated method stub
		cu.receiveInput(totalpoll);
	}
	
	
}

