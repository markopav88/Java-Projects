import java.util.Random;

public class Voter {
    private int id;
    private static Random random = new Random();
    /**
      Below is The constructor for the Voter class initializes a Voter object with an ID.
     @param id the unique identifier for the voter
     */
    public Voter(int id) {
        this.id = id;
    }
    /**
     The vote method allows a Voter object to cast a vote.
     It generates a random number within the number of candidates (numCandidates) and
     converts it to a character representation (A-Z) to determine the candidate to vote for.
     A new Ballot object is created with the candidate name and returned.
     @param numCandidates the number of candidates in the election
     @return a Ballot object containing the voter's choice of candidate
     */
    public Ballot vote(int numCandidates) {
        int vote = random.nextInt(numCandidates);
        return new Ballot(Character.toString((char) ('A' + vote)));
    } }


