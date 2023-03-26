public class VotingMachine {
    private int labourVotes;
    private int conservativeVotes;

    public void voteLabour() {
        ++labourVotes;
        labourVotes += (int) 3*Math.random();
    }
    public void voteConservative() {
        ++conservativeVotes;
    }

    public int getLabourVotes() {
        return labourVotes;
    }

    public int getConservativeVotes() {
        return conservativeVotes;
    }
    public void clear(){
        labourVotes = 0;
        conservativeVotes = 0;
    }
}
