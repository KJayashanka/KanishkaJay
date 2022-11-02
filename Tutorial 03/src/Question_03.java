public class Question_03 {
    public static void main(String[] args) {
        VotingMachine vMachine = new VotingMachine();

        for (int i = 1; i <= 1000; i++) {
            /* flip a coin what to vote for - vote for each party
            with 50% probability */
            double flip = Math.random();
            if (flip <= 0.5)
                vMachine.voteLabour();
            else
                vMachine.voteConservative();
        }
        // print results
        System.out.println("Election results");
        System.out.println("----------------");
        System.out.println("Labour received: " + vMachine.getLabourVotes());
        System.out.println("Conservatives received: " +
                vMachine.getConservativeVotes());
    }
}
