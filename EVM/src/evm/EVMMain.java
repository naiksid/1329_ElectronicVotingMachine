package evm;

public class EVMMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BallotingUnit bu = new BallotingUnit();
		ControlUnit cu = new Adapter();
		
		cu.addcandidate();
		cu.ballotbutton();
		bu.machineready();
		bu.castVote();
		
	}

}
