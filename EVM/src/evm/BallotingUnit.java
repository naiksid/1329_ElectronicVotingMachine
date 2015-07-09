package evm;

import java.util.ArrayList;
import java.util.Scanner;

public class BallotingUnit {

	int totalpoll=0;
	ArrayList <Candidate> candidates = new ArrayList<Candidate>();
	
	public int machineready(){
		System.out.println("Machine is ready");
		return 0;
	}

	
	public String castVote(){
		Scanner s = new Scanner(System.in);
		System.out.println("Select the appropriate button to cast the vote");
		System.out.println("Enter 1-Candidate One");
		System.out.println("Enter 2-Candidate Two");
		System.out.println("Enter 3-Candidate Three");
		int selectedCandidate = s.nextInt();
//		if(selectedCandidate==1){
//			for(int i=0;i<candidates.size();i++){
//				candidates.get(i).add(selectedCandidate);
//			}
//		}
		totalpoll=totalpoll+1;
		return "true";
	}


	public void sendoutput(ControlUnit cu) {
		// TODO Auto-generated method stub
		cu.receiveInput(totalpoll);
	}
	
	
}

